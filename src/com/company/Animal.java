package com.company;

public class Animal {
    private static int animalCounter = 0;

    protected Animal() {
        animalCounter++;
        System.out.println(String.format("Animal №%d родился!", animalCounter));
    }

    public void run (int meters) {
        System.out.println("Ну, побежали чтоли!");

    }

    public void sweem (int meters) {
        System.out.println("Левой, правой - хорошо плывет!");

    }

}
