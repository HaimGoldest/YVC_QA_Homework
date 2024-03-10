package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex4B {
    @Test
    public void WeakMethod4_FindError_NotFullBranchesCoverage(){
        int result = WeakClass.WeakMethod4(20, 0);
        assertEquals(0, result,0.001);
    }
}
