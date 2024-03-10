package yvc.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex1A {
    @Test
    public void WeakMethod1_FindError_NotFullStatementsCoverage(){
        int result = WeakClass.WeakMethod1(1, 0);
        assertEquals(1, result,0.001);
    }
}
