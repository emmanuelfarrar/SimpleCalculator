package edu.capella.it4782.simplecalculator;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class btnClickMathTest {

    @Mock
    View mockView;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void buttononClickTest() {

        // Do I need to use my own variables
        float num1 = 0;
        float num2 = 0;
        float result;

        MainActivity calc = new MainActivity();

        // Not sure how to structure this part

        assertTrue(calc.buttononClick(R.id.btnAdd));
        assertTrue(calc.buttononClick(R.id.btnSub));
        assertTrue(calc.buttononClick(R.id.btnMult));
        assertTrue(calc.buttononClick(R.id.btnDiv));

    }
}