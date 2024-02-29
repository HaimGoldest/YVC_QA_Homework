package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestWeakMethod1 {

    // 1-A
    @Test
    public void WeakMethod1_FindError_NotFullStatementsCoverage(){
        int result = WeakClass.WeakMethod1(1, 0);
        assertEquals(1, result,0.001);
    }

    // 1-B
    @Test
    public void WeakMethod1_NotFindError_FullStatementsCoverage(){
        int result1 = WeakClass.WeakMethod1(4, 0);
        assertEquals(4, result1,0.001);

        int result2 = WeakClass.WeakMethod1(1, 1);
        assertEquals(1, result2,0.001);
    }

    // 2-A
    @Test
    public void WeakMethod2_FindError_NotFullBranchesCoverage(){
        int result = WeakClass.WeakMethod2(1, 0);
        assertEquals(1, result,0.001);
    }

    // 2-B
    @Test
    public void WeakMethod2_NotFindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod2(4, 0);
        assertEquals(4, result1,0.001);

        int result2 = WeakClass.WeakMethod2(1, 1);
        assertEquals(1, result2,0.001);
    }

    // 3-A
    @Test
    public void WeakMethod3_NotFindError_FullStatementsCoverage(){
        int result1 = WeakClass.WeakMethod3(6, 0);
        assertEquals(6, result1,0.001);

        int result2 = WeakClass.WeakMethod3(8, 0);
        assertEquals(8, result2,0.001);
    }

    // 3-B
    @Test
    public void WeakMethod3_FindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod3(6, 0);
        assertEquals(6, result1,0.001);

        int result2 = WeakClass.WeakMethod3(8, 0);
        assertEquals(8, result2,0.001);

        int result3 = WeakClass.WeakMethod3(7, 0);
        assertEquals(0, result3,0.001);
    }

    // 4-A
    @Test
    public void WeakMethod4_NotFindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod4(10, 2);
        assertEquals(5, result1,0.001);

        int result2 = WeakClass.WeakMethod4(10, 0);
        assertEquals(-1, result2,0.001);
    }

    // 4-B
    @Test
    public void WeakMethod4_FindError_NotFullBranchesCoverage(){
        int result = WeakClass.WeakMethod4(20, 0);
        assertEquals(0, result,0.001);
    }

}
