package org.example;


import java.util.Scanner;

public class Main {
    static int coffeePrice[];

    public static void main(String[] args) {
        int coffeeSize;
        System.out.println("Размер кофе: 0=маленький 1=средний 2=большой");
        do {
            System.out.println("Пришёл новый клиент!");
            System.out.println("Сделайте свой выбор: ");
            Scanner console = new Scanner(System.in);
            coffeeSize = console.nextInt();
            System.out.println(sizeSelection(coffeeSize) + "руб.");
        }
        while (coffeeSize != 3);
        System.out.println("Кофейня закончила работу на сегодня. ");
    }

    private static int sizeSelection(int coffeeSize) {
        if (coffeePrice == null) {
            coffeePrice = new int[4];
            coffeePrice[0] = 25;
            coffeePrice[1] = 50;
            coffeePrice[2] = 75;
        }
        return (coffeePrice[coffeeSize]);
    }
}

