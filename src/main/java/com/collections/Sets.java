package com.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Sets {

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco","aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));

    public static String checkDrinks(String s, List<String> strings) {
        boolean categorizeDrink = false;
        for (String string : strings) {
            if (ALCOHOLS.contains(string)) {
                categorizeDrink = true;
            }
        }
        String finalMessage = "";
        if (categorizeDrink) {
            finalMessage += s + " Cocktail";
        }
        else {
            finalMessage += s + " Mocktail";
        }
        return finalMessage;
    }



}
