package yvc.ex2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleClassifier_Tests {
    TriangleClassifier triangle = new TriangleClassifier();

    @Test
    public void equilateralTriangle(){
        int a = 50;
        int b = 50;
        int c=50;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

    @Test
    public void isoscelesTriangle(){
        int a = 30;
        int b = 60;
        int c= 30;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

    @Test
    public void ScaleneTriangle(){
        int a = 25;
        int b = 50;
        int c= 75;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

    @Test
    public void notTriangle(){
        int a = 10;
        int b = 20;
        int c= 50;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

    @Test
    public void invalidTest(){
        int a = 50;
        int b = 50;
        int c= 110;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.ERROR.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
}
