package com.example.GroceryListMaker;
import lombok.Data;

@Data
public class Ingredient {
    public String name;
    public int quantity;

    public Ingredient(String name, int number) {
        this.name = name;
        this.quantity = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
