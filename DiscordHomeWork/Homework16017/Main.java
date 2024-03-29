package Teme.DiscordHomeWork.Homework16017;

import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String args[]) {

        //-Design a recipe book where you can add recipes, and search for recipes based on ingredients.
        //class Recipe {
        //    private String name;
        //    private List<String> ingredients;}
        //
        //-Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(),
        // metoda public boolean hasIngredient(String ingredient).
        //
        //-In clasa Main folositi acest array pentru a apela metoda hasIngredient() de mai sus:
        //List<Recipe> recipesWithMilk = new ArrayList<>();


        Recipe recipe1 = new Recipe("Burger", List.of("meat", "sauce", "cheese", "bread"));
        Recipe recipe2 = new Recipe("Salad", List.of("lettuce", "tomato", "ton", "olive oil"));

        List<Recipe> recipesWithMilk = new ArrayList<>();

        System.out.println("Ingredients of Recipe 1:");
        for (String ingredient : recipe1.getIngredients()) {
            System.out.println(ingredient);  //How to print receipe 1


        }
    }
}

