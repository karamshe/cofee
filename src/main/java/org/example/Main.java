package org.example;

import org.example.model.CoffeeType;
import org.example.model.MilkType;
import org.example.model.SizeType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
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
            user += 1;
            System.out.println("Пришёл новый клиент!");


            System.out.println("Какой размер кофе вы хотите?");
            System.out.println("Доступные варианты:");
            SizeTypes sizeTypes = new SizeTypesFileImpl(new File(Size));
            List<SizeType> allSizeTypes = sizeTypes.getAllSizeTypes();
            for (int i = 0; i < allSizeTypes.size(); i++) {
                SizeType type = allSizeTypes.get(i);
                System.out.println((i + 1) + ". " + type.getSizeName());
            }
            System.out.println("Сделайте выбор");
            Scanner SizeScanner = new Scanner(System.in);
            int selectedSize = SizeScanner.nextInt();

            SizeType selectedSizeType = null;
            if (selectedSize >= 1 && selectedSize <= allSizeTypes.size()) {
                selectedSizeType = allSizeTypes.get(selectedSize - 1);
                System.out.println("Вы выбрали: " + selectedSizeType.getSizeName());
            } else {
                System.out.println("Некорректный выбор.");
            }


            System.out.println("Какой вид кофе вы хотите?");
            System.out.println("Доступные варианты:");
            CoffeeTypes coffeeTypes = new CoffeeTypesFileImpl(new File(Coffee));
            List<CoffeeType> allCoffeeTypes = coffeeTypes.getAllCoffeeTypes();
            for (int i = 0; i < allCoffeeTypes.size(); i++) {
                CoffeeType type = allCoffeeTypes.get(i);
                System.out.println((i + 1) + ". " + type.getCoffeeName());
            }
            System.out.println("Сделайте выбор");
            Scanner CoffeeScanner = new Scanner(System.in);
            int selectedCoffee = CoffeeScanner.nextInt();

            CoffeeType selectedCoffeeType = null;
            if (selectedCoffee >= 1 && selectedCoffee <= allCoffeeTypes.size()) {
                selectedCoffeeType = allCoffeeTypes.get(selectedCoffee - 1);
                System.out.println("Вы выбрали: " + selectedCoffeeType.getCoffeeName());
            } else {
                System.out.println("Некорректный выбор.");
            }


            System.out.println("Какое молоко использовать?");
            System.out.println("Доступные варианты:");
            MilkTypes milkTypes = new MilkTypesFileImpl(new File(Milk));
            List<MilkType> allMilkTypes = milkTypes.getAllMilkTypes();
            for (int i = 0; i < allMilkTypes.size(); i++) {
                MilkType type = allMilkTypes.get(i);
                System.out.println((i + 1) + ". " + type.getMilkName());
            }
            System.out.println("Сделайте выбор");
            Scanner MilkScanner = new Scanner(System.in);
            int selectedMilk = MilkScanner.nextInt();

            MilkType selectedMilkType = null;
            if (selectedMilk >= 1 && selectedMilk <= allMilkTypes.size()) {
                selectedMilkType = allMilkTypes.get(selectedMilk - 1);
                System.out.println("Вы выбрали: " + selectedMilkType.getMilkName());
            } else {
                System.out.println("Некорректный выбор.");
            }
            System.out.println("Вы выбрали:");
            System.out.println(selectedSizeType.getSizeName() + " кофе с " + selectedCoffeeType.getCoffeeName() + " и " + selectedMilkType.getMilkName() + " молоко.");
            System.out.println("Цена:");
            if (user == 1) {
                break;
            }

        }
    }

}

