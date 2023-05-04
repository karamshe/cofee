package org.example;

import org.example.model.CoffeeType;

import java.util.List;


public interface CoffeeTypes {
    /**
     * Получить все доступные в кофейне типы кофе
     *
     * @return список всех типов кофе
     */
    List<CoffeeType> getAllCoffeeTypes();
}
