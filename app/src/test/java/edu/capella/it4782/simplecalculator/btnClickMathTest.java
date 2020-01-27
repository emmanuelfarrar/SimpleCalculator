package edu.capella.it4782.simplecalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/* U02A1 Notes: I had a bit of trouble with this while I was able to
make test that test the functionality of the operations. I was unable to
dive into the into the function and extract the code there to to it.
 */

public class btnClickMathTest {

   // MainActivity mainAct = new MainActivity();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBtnTest() {
        float num1 = 5;
        float num2 = 5;
        float result = 10;

        assertEquals(10, num1 + num2, 0.001f);
    }

    @Test
    public void subtrBtnTest() {
        float num1 = 5;
        float num2 = 5;
        float result = 0;

        assertEquals(result, num1 - num2, 0.001f);
    }

    @Test
    public void multiBtnTest() {
        float num1 = 5;
        float num2 = 5;
        float result = 25;

        assertEquals(result, num1 * num2, 0.001f);
    }

    @Test
    public void divBtnTest() {
        float num1 = 5;
        float num2 = 5;
        float result = 1;

        assertEquals(result, num1 / num2, 0.001f);
    }

}