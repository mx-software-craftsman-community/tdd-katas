package org.mxscc.leapyear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for LeapYear.
 */
public class LeapYearTest
{

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000, 2004})
    public void testIsLeapYearIfDivisibleBy4(int year){
        assertTrue(new LeapYear().isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1997, 1998, 1998})
    public void testIsNotLeapYearIfNotDivisibleBy4(int year){
        assertFalse(new LeapYear().isLeapYear(year));
    }

}
