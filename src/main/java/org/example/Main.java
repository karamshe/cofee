package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    static int coffeePrice[];

    public static void main(String[] args) throws IOException {
        String coffeeBasket = "src/main/resources/Basket.txt";
        String Coffee = "src/main/resources/Coffee.txt";
        String Milk = "src/main/resources/Milk.txt";
        String Size = "src/main/resources/Size.txt";

        int user = 0;
        while (true) {
            user+=1;
            System.out.println("Пришёл новый клиент!");

            System.out.println("Какой размер кофе вы хотите?");
            System.out.println("Доступные варианты");
            try (BufferedReader br = new BufferedReader(new FileReader(Size))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

            System.out.println("Какой вид кофе вы хотите?");
            System.out.println("Доступные варианты:");
            try (BufferedReader br = new BufferedReader(new FileReader(Coffee))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

            System.out.println("Какое молоко использовать?");
            System.out.println("Доступные варианты:");
            try (BufferedReader br = new BufferedReader(new FileReader(Milk))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
            if (user == 1) {
                break;
            }

        }
    }

}

