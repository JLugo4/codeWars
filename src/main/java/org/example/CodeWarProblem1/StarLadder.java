package org.example.CodeWarProblem1;

public class StarLadder {
    public static String pattern(int n){
        StringBuilder ladder = new StringBuilder("1");

        for(int i = 1; i < n; i++){
            if(n == 1){
                return ladder.toString();
            }else{

                ladder.append("\n");

                ladder.append("1");

                for(int j = 1; j <= i; j++){
                    ladder.append("*");
                }if(i < n){
                    ladder.append(i + 1);
                }
            }
        }
        return ladder.toString();
    }
}