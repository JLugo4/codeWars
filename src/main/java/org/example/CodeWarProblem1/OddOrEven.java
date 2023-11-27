package org.example.CodeWarProblem1;

public class OddOrEven {
    public static String evenOrOdd(int number) {
        String even = "Even";
        String odd = "Odd";

        if(number % 2 == 0){
            return even;
        } else{
            return odd;
        }
    }
}