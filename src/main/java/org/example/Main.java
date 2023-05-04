package org.example;

import org.example.model.CoffeeType;
import org.example.model.MilkType;
import org.example.model.SizeType;

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
            System.out.println("Доступные варианты:");
            SizeTypes sizeTypes = new SizeTypesFileImpl(new File(Size));
            List<SizeType> allSizeTypes = sizeTypes.getAllSizeTypes();
            for (SizeType type : allSizeTypes) {
                System.out.println(type.getSizeName());
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
            MilkTypes milkTypes = new MilkTypesFileImpl(new File(Milk));
            List<MilkType> allMilkTypes = milkTypes.getAllMilkTypes();
            for (MilkType type : allMilkTypes) {
                System.out.println(type.getMilkName());
            }

            if (user == 1) {
                break;
            }

        }
    }

}

