package org.example.CodeWarProblem1;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];


        // add combine arrays
        for(int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i] + arr2[i];
        }
        //sum newArr
        int sum = 0;
        for(int value : newArr){
            sum += value;
        }


        return sum;
    }

}