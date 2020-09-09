package org.mxscc.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldGetNumberAsString(){
        assertEquals("1", fizzBuzz.getNumberString(1));
        assertEquals("2", fizzBuzz.getNumberString(2));
    }

    @Test
    public void shouldGetFizzWhenMultipleOfThree(){
        assertEquals("Fizz", fizzBuzz.getNumberString(3));
        assertEquals("Fizz", fizzBuzz.getNumberString(9));
    }

    @Test
    public void shouldGetBuzzWhenMultipleOfFive(){
        assertEquals("Buzz", fizzBuzz.getNumberString(5));
        assertEquals("Buzz", fizzBuzz.getNumberString(10));
        assertEquals("Buzz", fizzBuzz.getNumberString(20));
    }

    @Test
    public void shouldGetFizzBuzzWhenMultipleOfThreeAndFive(){
        assertEquals("FizzBuzz", fizzBuzz.getNumberString(15));
        assertEquals("FizzBuzz", fizzBuzz.getNumberString(30));
    }
}
