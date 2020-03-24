package model;

public class Ingredient {
    private String name;
    private boolean vegetarian;



    public Ingredient(String name, boolean vegetarian) {
        this.name = name;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
