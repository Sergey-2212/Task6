package com.company;

public class Cat extends Animal{
    private static int catCounter = 0;

    public Cat() {
        catCounter++;
        System.out.println(String.format("Cat №%d родился!", catCounter));

    }

    public void run(int meters) {
        if (meters <= 200 && meters >=0) {
            System.out.printf("Котик пробежал %dм.\n", meters);
        } else {
            System.out.println("Ты что-то попутал. Я так не умею!");
        }
    }

    public void sweem (int meters) {
        System.out.println("Эво что удумал? Вот сам и плыви!!!");
    }


}
