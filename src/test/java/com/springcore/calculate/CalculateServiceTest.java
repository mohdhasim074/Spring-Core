package com.springcore.calculate;

import org.junit.Assert;
import org.junit.Test;

public class CalculateServiceTest {

    //	test method of addition
    @Test
    public void additionTest() {
        System.out.println("Test for addition :=> ");
        int result = CalculateService.addition(12, 24);
        int expected = 36;
//		expected  : 36

//		actual result  : 34

        Assert.assertEquals(expected, result);
    }
}
