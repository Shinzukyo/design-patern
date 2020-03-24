package model;

import java.util.ArrayList;

public class Kebab {
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Ingredient> sauces;

    public Kebab() {
        this.ingredients = new ArrayList<>();
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
        Ingredient sauce = new Ingredient(name, Aliment.Type.SAUCE);
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
