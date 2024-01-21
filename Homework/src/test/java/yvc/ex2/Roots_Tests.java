package yvc.ex2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Roots_Tests {

    @Test
    public void Min()
    {
        // a=0 - Not Quadratic
        Roots.calculate_roots(0,10,20);
        String  root_expected = Root_Types.Not_quadratic.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void Min_Plus_1()
    {
        // Two_roots
        Roots.calculate_roots(1,51,50);
        String  root_expected = Root_Types.Two_roots.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void Mid()
    {
        // No_roots
        Roots.calculate_roots(45,30,20);
        String  root_expected = Root_Types.No_roots.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void Max()
    {
        // Equal_roots
        Roots.calculate_roots(100,100,25);
        String  root_expected = Root_Types.Equal_roots.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void Max_Minus_1()
    {
        // No_roots
        Roots.calculate_roots(99,50,25);
        String  root_expected = Root_Types.No_roots.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void Invalid_Min()
    {
        // ERROR
        Roots.calculate_roots(-1,50,50);
        String  root_expected = Root_Types.ERROR.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void Invalid_Max()
    {
        // ERROR
        Roots.calculate_roots(101,50,50);
        String  root_expected = Root_Types.ERROR.toString();
        assertEquals(root_expected, Roots.root_types().toString());
    }
}
