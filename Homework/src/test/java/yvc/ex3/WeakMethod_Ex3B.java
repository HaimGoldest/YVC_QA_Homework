package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex3B {
    @Test
    public void WeakMethod3_FindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod3(6, 0);
        assertEquals(6, result1,0.001);

        int result2 = WeakClass.WeakMethod3(8, 0);
        assertEquals(8, result2,0.001);

        int result3 = WeakClass.WeakMethod3(7, 0);
        assertEquals(0, result3,0.001);
    }
}
