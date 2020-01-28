package lab9;


import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Challange3 {
    public static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog");

    static void displayLitere(){
        Flux.fromIterable(words).map(word -> word.charAt(0)).subscribe(System.out::println);
    }

    public static void main(String[] args) {
        displayLitere();
    }
    }

