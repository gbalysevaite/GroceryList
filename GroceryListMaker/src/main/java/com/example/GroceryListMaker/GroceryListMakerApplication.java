package com.example.GroceryListMaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryListMakerApplication {

	public static void main(String[] args) {
		String input = "onion garlic paprika bread";

		SpringApplication.run(GroceryListMakerApplication.class, args);
		IngredientMatcher matcher = new IngredientMatcher();


//		matcher.makeInitialList();
//		matcher.printGroceryList();
//		matcher.checkMatches();
		matcher.printGroceryList(matcher.inputToObjects(input));
	}

}
