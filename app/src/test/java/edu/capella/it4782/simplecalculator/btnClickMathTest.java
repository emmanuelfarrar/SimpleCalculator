package edu.capella.it4782.simplecalculator;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;


public class btnClickMathTest {

    MainActivity mainAct = Mockito.mock(MainActivity.class);



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBtnTest() {


        assertEquals(5.0f, mainAct.btnAdd);


    }


}