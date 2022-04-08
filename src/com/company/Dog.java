package com.company;

public class Dog extends Animal {
    private static int dogCounter = 0;

    public Dog() {
        dogCounter++;
        System.out.println(String.format("Dog №%d родился!", dogCounter));

    }

    @Override
    public void run(int meters) {
        if (meters <= 500 && meters >=0) {
            System.out.printf("Пёсик пробежал %dм.\n", meters);
        } else {
            System.out.println("Ты что-то попутал. Я так не умею!");
        }
    }

    public void sweem (int meters) {
        if (meters > 10) {
            System.out.println("Ты что, хочешь меня утопить?");
        } else if (meters < 0) {
            System.out.println("Неее, обратно не поплыву!");
        } else {
            System.out.printf("Пёсик проплыл %dм.\n", meters);
        }
    }
}
