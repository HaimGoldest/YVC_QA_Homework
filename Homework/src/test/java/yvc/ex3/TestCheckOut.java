package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCheckOut {
    @Test
    public void test_1()
    {
        Status status = Status.gold;
        double cart = 3499;
        int creditRating = -1;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertTrue(result);
    }

    @Test
    public void test_2()
    {
        Status status = Status.gold;
        double cart = 3500;
        int creditRating = 651;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertTrue(result);
    }

    @Test
    public void test_3()
    {
        Status status = Status.gold;
        double cart = 3500;
        int creditRating = 650;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertFalse(result);
    }

    @Test
    public void test_4()
    {
        Status status = Status.silver;
        double cart = 2499;
        int creditRating = -1;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertTrue(result);
    }

    @Test
    public void test_5()
    {
        Status status = Status.silver;
        double cart = 2500;
        int creditRating = 751;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertTrue(result);
    }

    @Test
    public void test_6()
    {
        Status status = Status.silver;
        double cart = 2500;
        int creditRating = 750;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertFalse(result);
    }

    @Test
    public void test_7()
    {
        Status status = Status.bronze;
        double cart = 1499;
        int creditRating = -1;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertTrue(result);
    }

    @Test
    public void test_8()
    {
        Status status = Status.bronze;
        double cart = 1500;
        int creditRating = 801;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertTrue(result);
    }

    @Test
    public void test_9()
    {
        Status status = Status.bronze;
        double cart = 1500;
        int creditRating = 800;

        boolean result = CheckOut.checkOut(cart,creditRating,status);
        assertFalse(result);
    }
}
