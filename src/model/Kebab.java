package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Kebab {
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Ingredient> sauces;

    public enum Model{SANS_OIGNON, SUPPLEMENT_FROMAGE};

    private Ingredient[] SANS_OIGNON = {
            new Ingredient("Salade", Aliment.TYPE.VEGETAL),
            new Ingredient("Tomate", Aliment.TYPE.VEGETAL),
            new Ingredient("Cornichon", Aliment.TYPE.VEGETAL)
    };

    private Ingredient[] SUPPLEMENT_FROMAGE = {
            new Ingredient("Salade", Aliment.TYPE.VEGETAL),
            new Ingredient("Tomate", Aliment.TYPE.VEGETAL),
            new Ingredient("Oignon", Aliment.TYPE.VEGETAL),
            new Ingredient("Cheddar", Aliment.TYPE.CHEESE),
            new Ingredient("Cheddar", Aliment.TYPE.CHEESE)
    };

    public Kebab() {
        this.ingredients = new ArrayList<>();
    }

    public Kebab(Model model){
        this.ingredients = new ArrayList<>();
        switch (model){
            case SANS_OIGNON:
                this.ingredients.addAll(Arrays.asList(this.SANS_OIGNON));
                break;

            case SUPPLEMENT_FROMAGE:
                this.ingredients.addAll(Arrays.asList(this.SUPPLEMENT_FROMAGE));
                break;

            default:
                break;
        }
    }


    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    public void addSauce(String name){
        Ingredient sauce = new Ingredient(name, Aliment.TYPE.SAUCE);
        this.sauces.add(sauce);
    }

    public boolean vegetarian(){
        for(Ingredient ingredient : ingredients){
            if( !ingredient.vegetarian()){
                return false;
            }
        }
        return true;
    }

    public boolean pescaterian(){
        for(Ingredient ingredient : ingredients){
            if( !ingredient.pescaterian()){
                return false;
            }
        }
        return true;
    }

    public void sauces(){
        System.out.println(this.sauces);
    }
}
