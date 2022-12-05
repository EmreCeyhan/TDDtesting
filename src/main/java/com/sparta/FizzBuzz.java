package com.sparta;

public class FizzBuzz {
    public static String fizzBuzz(Integer n)
    {
        if (n <= 50) {
            if (n % 3 == 0 && n % 5 == 0)
                return "FizzBuzz";
            else if (n % 3 == 0)
                return "Fizz";
            else if (n % 5 == 0)
                return "Buzz";
            else {return n.toString();}
        }
        else
        {
            return "Max exceeded";
        }



    }
}
