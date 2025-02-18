package com.neeko.level02.normal;

public class RandomMarker {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
    public static String randomUpperAlphabet(int length) {
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * (90 - 65 + 1) + 65); // A(65) ~ Z(90)
            word.append((char) rand);
        }

        return word.toString();
    }
    public static String rockPaperScissors(){
        String gababo=" ";
        if (Math.random()*100 %3 == 0){
            gababo = "rock";
        }
        else if (Math.random()*100 %3 == 1){
            gababo = "scissors";
        }
        else
            gababo = "paper";
        return gababo;
    }
    public static String tossCoin(){
        String coin=" ";
        if (Math.random()*100 %2 == 0){
            coin = "앞면";
        }

        else
            coin = "뒷면";
        return coin;
    }
}
