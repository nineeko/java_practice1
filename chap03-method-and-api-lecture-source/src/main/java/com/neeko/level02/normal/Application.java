package com.neeko.level02.normal;

public class Application {

    public static void main(String[] args) {
        RandomMarker randomMarker = new RandomMarker();
        System.out.println(randomMarker.randomNumber(-30,-35));
        System.out.println(randomMarker.randomUpperAlphabet(5));
        System.out.println(randomMarker.rockPaperScissors());
        System.out.println(randomMarker.tossCoin());
    }
}
