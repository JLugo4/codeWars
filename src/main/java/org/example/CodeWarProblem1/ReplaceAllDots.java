package org.example.CodeWarProblem1;

public class ReplaceAllDots {

    public static String replaceDots(final String str) {
        StringBuilder noMoreDots = new StringBuilder(str);
        char dot = '.';
        char dash = '-';

        for(int i = 0; i < noMoreDots.length(); i++){
            if(noMoreDots.charAt(i) == dot){
                noMoreDots.setCharAt(i, dash);
            }
        }


        return noMoreDots.toString();
    }

}