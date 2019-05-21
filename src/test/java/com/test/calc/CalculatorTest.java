package com.test.calc;

import org.junit.Assert;
import org.junit.Test;

import com.test.calc.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(6, Calculator.add(4, 2));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(2, Calculator.sub(4, 2));
    }

}