package org.example.CodeWarProblem1;

public class Remove {
    public static String remove(String str) {
        String strNew = str.substring(0, str.length()-1);

        if(strNew.length() > 0){
            return strNew.substring(1);
        } else {
            return strNew;
        }
    }
}
