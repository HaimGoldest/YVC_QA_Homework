package yvc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex2_Tests {

    // BVA for class C (70-79)
    // Test if input is in Class C or not.

    @Test
    // Min
    public void Ex2_1() {
        Ex2 ex2 = new Ex2();
        String actualResult = ex2.getGrade(70);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Min + 1
    public void Ex2_2() {
        Ex2 ex2 = new Ex2();
        String actualResult = ex2.getGrade(71);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Mid
    public void Ex2_3() {
        Ex2 ex2 = new Ex2();
        String actualResult = ex2.getGrade(75);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Max
    public void Ex2_4() {
        Ex2 ex2 = new Ex2();
        String actualResult = ex2.getGrade(79);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Max - 1
    public void Ex2_5() {
        Ex2 ex2 = new Ex2();
        String actualResult = ex2.getGrade(78);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }
}
