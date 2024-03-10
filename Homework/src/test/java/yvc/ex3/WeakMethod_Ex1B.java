package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex1B {
    @Test
    public void WeakMethod1_NotFindError_FullStatementsCoverage(){
        int result1 = WeakClass.WeakMethod1(4, 0);
        assertEquals(4, result1,0.001);

        int result2 = WeakClass.WeakMethod1(1, 1);
        assertEquals(1, result2,0.001);
    }
}
