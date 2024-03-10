package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex4A {
    @Test
    public void WeakMethod4_NotFindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod4(10, 2);
        assertEquals(5, result1,0.001);

        int result2 = WeakClass.WeakMethod4(10, 0);
        assertEquals(-1, result2,0.001);
    }
}
