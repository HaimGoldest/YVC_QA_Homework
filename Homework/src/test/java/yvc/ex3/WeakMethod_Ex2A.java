package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex2A {
    @Test
    public void WeakMethod2_FindError_NotFullBranchesCoverage(){
        int result = WeakClass.WeakMethod2(1, 0);
        assertEquals(1, result,0.001);
    }
}
