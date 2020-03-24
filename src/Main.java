import model.Ingredient;
import model.Kebab;

public class Main {
    public static void main (String[] args) {
        Ingredient i1 = new Ingredient("Salade", true);
        Ingredient i2 = new Ingredient("Tomate", true);
        Ingredient i3 = new Ingredient("Oignon", true);
        Ingredient i4 = new Ingredient("Cornichon", true);
        Kebab kebab = new Kebab();
        kebab.addIngredient(i1);
        kebab.addIngredient(i2);
        kebab.addIngredient(i3);
        kebab.addIngredient(i4);
        System.out.println("Hello World");
        System.out.println("Kebab is vegetarian : " + kebab.vegetarian());
    }
}
