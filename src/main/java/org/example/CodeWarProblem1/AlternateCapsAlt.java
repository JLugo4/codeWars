package org.example.CodeWarProblem1;

public class AlternateCapsAlt {

    public static void main(String[] args) {

        String s = "awholebunchofbullshitgoeshere";
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s + " " + s);

        for (int i = 0; i < sb.length(); i += 2) {
            char currentChar = sb.charAt(i);
            char upperCaseChar = Character.toUpperCase(currentChar);
            sb.setCharAt(i, upperCaseChar);
        }
        String finalString = sb.toString();
        System.out.println(finalString);


    }
}