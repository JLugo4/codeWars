package org.example.CodeWarProblem1;

public class Small {
    public static int findSmallestInt(int[] args) {
        int small = args[0];

        for(int i = 0; i < args.length; i++){
            if(args[i] < small){
                small = args[i];
            }
        }
        return small;
    }
}