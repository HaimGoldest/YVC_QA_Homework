package yvc.ex2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Roots_Tests {
    Roots root;

    @Test
    public void testPartion1()
    {
        //(0,1,2)
        Roots.calculate_roots(-2, 1, 2);

        String  root_expected = Root_Types.ERROR.toString();


        assertEquals(root_expected, Roots.root_types().toString());
    }
}
