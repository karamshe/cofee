package org.example;

import org.example.model.CoffeeType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    static int coffeePrice[];

    public static void main(String[] args) throws IOException {
        String coffeeBasket = "src/main/resources/Basket.txt";
        String Coffee = "src/main/resources/Coffee.txt";
        String Milk = "src/main/resources/Milk.txt";
        String Size = "src/main/resources/Size.txt";

        int user = 0;
        while (true) {
            user += 1;
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
            CoffeeTypes coffeeTypes = new CoffeeTypesFileImpl(new File(Coffee));
            List<CoffeeType> allCoffeeTypes = coffeeTypes.getAllCoffeeTypes();
            for (CoffeeType type : allCoffeeTypes) {
                System.out.println(type.getCoffeeName());
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

