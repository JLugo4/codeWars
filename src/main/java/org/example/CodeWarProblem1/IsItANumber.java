package org.example.CodeWarProblem1;

public class IsItANumber{

    public boolean isDigit(String s)
    {
        try{
            Float.parseFloat(s);
            return true;
        } catch(NumberFormatException numberFormatException){
            return false;
        }
    }
}