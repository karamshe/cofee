package org.example.model;

/**
 * Простой класс-модель для типа кофе. Содержит поля о названии кофе и цене
 */
public class CoffeeType {
    /**
     * Название кофе
     */
    private String coffeeName;

    /**
     * Цена
     */
    private Double price;

    /**
     * Конструктор для класса, куда передаётся название и цена кофе, а возвращается новый объект типа CoffeeType
     *
     * @param coffeeName название кофе
     * @param price      цена кофе
     */
    public CoffeeType(String coffeeName, Double price) {
        this.coffeeName = coffeeName; //присваиваем переменной класса coffeeName (к которой обращаемся через this.) "внешнее" значение coffeeName
        this.price = price; //присваиваем переменной класса price (к которой обращаемся через this.) "внешнее" значение price
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
