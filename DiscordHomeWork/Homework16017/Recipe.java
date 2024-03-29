package Teme.DiscordHomeWork.Homework16017;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    String name;
    List<String> ingredients;

    Recipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients= ingredients;
    }

    String getName() {
        return name;
    }

    List<String> getIngredients() {
        return ingredients;
    }

    void setName(String name) {
        this.name = name;
    }

    void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    void addRecipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }

}












