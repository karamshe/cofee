package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    static int coffeePrice[];

    public static void main(String[] args) throws IOException {
        String coffeeMilk = "src/main/resources/Coffee.txt";
        int coffeeSize = -1;
        Scanner console = new Scanner(System.in);
        System.out.println("Размер кофе: 0=маленький 1=средний 2=большой");
        while (true) {
            System.out.println("Пришёл новый клиент!");
            System.out.println("Сделайте свой выбор: ");
            coffeeSize = console.nextInt();
            if (coffeeSize == 3) {
                break;
            }
            System.out.println("Добавить капучино на миндальном молоке?");
            Scanner milk = new Scanner(System.in);
            String answer = milk.nextLine();
            if (answer.equalsIgnoreCase("Да")) {
                FileWriter writer = new FileWriter(coffeeMilk, true);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.newLine();
                bufferWriter.write(sizeSelection(coffeeSize) + " руб. Капучино на миндальном молоке.");
                bufferWriter.close();
                System.out.println("Добавлено в корзину капучино на миндальном молоке. Итого: " + sizeSelection(coffeeSize) + "руб");
            } else if (answer.equalsIgnoreCase("Нет")) {
                System.out.println("Добавить капучино на кокосовом молоке?");
                answer = milk.nextLine();
                if (answer.equalsIgnoreCase("Да")) {
                    FileWriter writer = new FileWriter(coffeeMilk, true);
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.newLine();
                    bufferWriter.write(sizeSelection(coffeeSize) + " руб. Капучино на кокосовом молоке");
                    bufferWriter.close();
                    System.out.println("Добавлено в корзину капучино на кокосовом молоке. Итого: " + sizeSelection(coffeeSize) + "руб");
                }

            } else if (answer.equalsIgnoreCase("Нет")) {
                System.out.println("Добавить капучино на соевом молоке?");
                answer = milk.nextLine();
                if (answer.equalsIgnoreCase("Да")) {
                    FileWriter writer = new FileWriter(coffeeMilk, true);
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.newLine();
                    bufferWriter.write(sizeSelection(coffeeSize) + " руб. Капучино на соевом молоке");
                    bufferWriter.close();
                    System.out.println("Добавлено в корзину капучино на соевом молоке. Итого: " + sizeSelection(coffeeSize) + "руб");
                }
            } else {
                System.out.println("Ошибка");

            }
        }
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

