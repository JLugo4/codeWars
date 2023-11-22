package org.example.CodeWarProblem1;

public class AlternateCaps {
    public static String[] capitalize(String s){
        // Gorillaz - Do Ya Thing (2010)
        char[] evensChar = s.toCharArray();
        char[] oddsChar = s.toCharArray();
        for(int i = 0; i < evensChar.length; i +=2){
            evensChar[i] = Character.toUpperCase(evensChar[i]);
        }
        for(int i = 1; i < oddsChar.length; i +=2){
            oddsChar[i] = Character.toUpperCase(oddsChar[i]);
        }
        String evens = new String(evensChar);
        String odds = new String(oddsChar);

        String[] AlternateCaps = new String[2];
        AlternateCaps[0] = evens;
        AlternateCaps[1] = odds;

        return AlternateCaps;
    }
}
