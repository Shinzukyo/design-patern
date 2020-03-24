package model;

import java.util.ArrayList;

public class Kebab {
    private ArrayList<Ingredient> ingredients;

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

    public void removeIngredient(String name){
        for (int i = 0 ; i < this.ingredients.size(); i++){
            if(this.ingredients.get(i).getName().equals(name)){
                this.ingredients.remove(i);
                break;
            }
        }
    }

    public boolean vegetarian(){
        for(Ingredient ingredient : ingredients){
            if( !ingredient.isVegetarian()){
                return false;
            }
        }
        return true;
    }
}
