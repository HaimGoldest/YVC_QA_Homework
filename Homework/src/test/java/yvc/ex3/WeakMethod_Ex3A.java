package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex3A {
    @Test
    public void WeakMethod3_NotFindError_FullStatementsCoverage(){
        int result = WeakClass.WeakMethod3(0, 2);
        assertEquals(2, result,0.001);
    }
}
