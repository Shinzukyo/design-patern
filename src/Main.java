import model.Aliment;
import model.Ingredient;
import model.Kebab;

public class Main {
    public static void main (String[] args) {
        Ingredient i1 = new Ingredient("Salade", Aliment.Type.VEGETAL);
        Ingredient i2 = new Ingredient("Tomate", Aliment.Type.VEGETAL);
        Ingredient i3 = new Ingredient("Oignon", Aliment.Type.VEGETAL);
        Ingredient i4 = new Ingredient("Cornichon", Aliment.Type.VEGETAL);
        Ingredient i5 = new Ingredient("Crevette", Aliment.Type.FISH);
        Kebab kebab = new Kebab();
        kebab.addIngredient(i1);
        kebab.addIngredient(i2);
        kebab.addIngredient(i3);
        kebab.addIngredient(i4);
        kebab.addIngredient(i5);
        System.out.println("Hello World");
        System.out.println("Kebab is vegetarian : " + kebab.vegetarian());
        System.out.println("Kebab is pescaterian : " + kebab.pescaterian());
    }
}
