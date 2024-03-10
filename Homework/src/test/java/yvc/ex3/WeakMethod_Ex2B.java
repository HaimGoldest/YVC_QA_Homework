package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex2B {
    @Test
    public void WeakMethod2_NotFindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod2(4, 0);
        assertEquals(4, result1,0.001);

        int result2 = WeakClass.WeakMethod2(1, 1);
        assertEquals(1, result2,0.001);
    }
}
