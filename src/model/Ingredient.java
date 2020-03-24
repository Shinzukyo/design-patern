package model;

public class Ingredient extends Aliment{
    private String name;
    private Type type;

    public Ingredient(String name, Type type) {
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
        return this.type == Type.VEGETAL;
    }

    public boolean pescaterian(){
        return this.type == Type.FISH || this.type == Type.VEGETAL;
    }
}
