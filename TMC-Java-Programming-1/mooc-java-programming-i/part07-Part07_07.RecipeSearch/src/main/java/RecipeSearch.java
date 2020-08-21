
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try (Scanner fs = new Scanner(Paths.get(file))) {
            boolean gotRecipeName = false;
            boolean gotRecipeDuration = false;
            boolean gotRecipeIngredients = false;
            
            String name = "";
            int duration = 0;
            Recipe recipe = null;
            
            while (fs.hasNextLine()) {                
                String row = fs.nextLine();
                
                if (!gotRecipeName && !gotRecipeDuration) {
                    //System.out.println("Recipe Row");
                    gotRecipeName = true;
                    gotRecipeIngredients = false;
                    name = row;
                } else if (gotRecipeName && !gotRecipeDuration) {
                    //System.out.println("Duration Row");
                    gotRecipeDuration = true;
                    duration = Integer.valueOf(row);
                    recipe = new Recipe(name, duration);
                    recipes.add(recipe);
                } else if (gotRecipeDuration && gotRecipeDuration && !(row.trim().length() == 0)) {
                    recipe.addIngredient(row);
                } else if (gotRecipeDuration && gotRecipeDuration && (row.trim().length() == 0)) {
                    gotRecipeIngredients = true;
                    gotRecipeName = false;
                    gotRecipeDuration = false;
                    name = "";
                    duration = 0;
                    recipe = null;
                    //System.out.println("Blank Row");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("");
        
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient\n");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            
            if (command.equalsIgnoreCase("list")) {
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
                System.out.println("");
            } else if (command.equalsIgnoreCase("find name")) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if(recipe.getName().contains(searchWord)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            } else if (command.equalsIgnoreCase("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if(recipe.getDuration() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            } else if (command.equalsIgnoreCase("find ingredient")) {
                System.out.print("Ingredient: ");
                String findIngredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.contains(findIngredient)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            }
        }
    }

}
