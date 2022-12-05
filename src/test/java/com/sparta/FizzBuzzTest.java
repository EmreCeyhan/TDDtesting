package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Given one, return one as a string")
    public void givenOne_Return_OneString()
    {
        String result = FizzBuzz.fizzBuzz(1);
        assertEquals("1", result);
    }

    @Test
    @DisplayName("Given Three, return Fizz")
    public void givenThree_Return_Fizz()
    {
        String result = FizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }
    @Test
    @DisplayName("Given 5, return Buzz")
    public void givenFive_Return_Buzz()
    {
        String result = FizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName("Given 15, return FizzBuzz")
    public void givenFifteen_Return_FizzBuzz()
    {
        String result = FizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "4, 4"})
    @DisplayName("Given a number return it as a string")
    void returnNumberAsString(int input, String expected)
    {
        assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }
    @ParameterizedTest
    @CsvSource({"3", "6", "9", "12"})
    @DisplayName("Given a number divisible by Three but not five, return Fizz")
    void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input)
    {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(input));
    }
    @ParameterizedTest
    @CsvSource({"5", "10", "20", "25"})
    @DisplayName("Given a number divisible by 5 but not 3, return Buzz")
    void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input)
    {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(input));
    }
    @ParameterizedTest
    @CsvSource({"15", "30", "45"})
    @DisplayName("Given a number divisible by 15, return FizzBuzz")
    void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input)
    {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(input));
    }

}