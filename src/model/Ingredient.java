package model;

public class Ingredient extends Aliment{
    private String name;
    private TYPE type;

    public Ingredient(String name, TYPE type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean vegetarian(){
        return this.type == TYPE.VEGETAL;
    }

    public boolean pescaterian(){
        return this.type == TYPE.FISH || this.type == TYPE.VEGETAL;
    }
}
