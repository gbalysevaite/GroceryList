package com.example.GroceryListMaker;

import java.util.*;

public class IngredientMatcher {

    List<Ingredient> groceryList = new ArrayList<>();

    public static List<Ingredient> inputToObjects(String input) {
        List<String> ingredientsToList = new ArrayList<>(Arrays.asList(input.split(" ")));
        List<Ingredient> ingredientList = new ArrayList<>();
        for (int i = 0; i <= ingredientsToList.size()-1; i++) {
            ingredientList.add(new Ingredient(ingredientsToList.get(i), 1));
            //System.out.println(ingredientList.get(i).quantity + " of " + ingredientList.get(i).name);
        }
        return ingredientList;
    }

    public List<Ingredient> addNewItemsToList (List<Ingredient> ingredientList) {


        return groceryList;
    }

    public void printGroceryList(List<Ingredient> shoppingList) {
        for (Ingredient item : shoppingList) {
            System.out.println(item.getQuantity() + " of " + item.getName());
        }
    }
}