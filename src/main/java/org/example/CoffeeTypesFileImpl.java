package org.example;

import org.example.model.CoffeeType;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализация интерфейса CoffeeTypes через файлы
 */
public class CoffeeTypesFileImpl implements CoffeeTypes {

    private final File file;

    public CoffeeTypesFileImpl(File file) {
        this.file = file;
    }

    @Override
    public List<CoffeeType> getAllCoffeeTypes() {
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            return reader
                    .lines() //получаем все строки файла в Стриме
                    .map(this::newCoffeeType) // преобразуем String к объекту CoffeeType с помощью приватного метода класса
                    .collect(Collectors.toList()); // Собираем преобразованные объекты в Список
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Преобразование Строки с записью о названии кофе и цене в объект CoffeeType
     * Строка имеет формат "coffeeName,price"
     *
     * @param line строка
     * @return новый объект типа кофе
     */
    private CoffeeType newCoffeeType(String line) {
        String[] data = line.split(","); //разделяем строку на массив строк по ключевому символу
        return new CoffeeType(data[0], Double.parseDouble(data[1])); //первый элемент соответствует названию кофе, второй - цене
    }
}
