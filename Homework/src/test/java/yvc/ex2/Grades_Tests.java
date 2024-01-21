package yvc.ex2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Grades_Tests {

    // BVA for class C (70-79)
    // Test if input is in Class C or not.

    @Test
    // Min
    public void Ex2_1() {
        Grades grades = new Grades();
        String actualResult = grades.getGrade(70);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Min + 1
    public void Ex2_2() {
        Grades grades = new Grades();
        String actualResult = grades.getGrade(71);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Mid
    public void Ex2_3() {
        Grades grades = new Grades();
        String actualResult = grades.getGrade(75);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Max
    public void Ex2_4() {
        Grades grades = new Grades();
        String actualResult = grades.getGrade(79);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    // Max - 1
    public void Ex2_5() {
        Grades grades = new Grades();
        String actualResult = grades.getGrade(78);
        String expectedResult = "C";
        assertEquals(expectedResult,actualResult);
    }
}
