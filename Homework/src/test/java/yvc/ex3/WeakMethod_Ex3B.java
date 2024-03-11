package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex3B {
    @Test(expected = java.lang.ArithmeticException.class)
    public void WeakMethod3_FindError_FullBranchesCoverage(){
        int result1 = WeakClass.WeakMethod3(5, 1);
        assertEquals(6, result1,0.001);

        // Should get Exception
        WeakClass.WeakMethod3(0, 0);
    }
}
