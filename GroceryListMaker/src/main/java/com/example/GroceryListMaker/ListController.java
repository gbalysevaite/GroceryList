package com.example.GroceryListMaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {

    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients(String foods) {
        return IngredientMatcher.inputToObjects(foods);
    }
}
