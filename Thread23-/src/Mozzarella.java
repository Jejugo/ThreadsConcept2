/**
 * Created by jeffgoes on 6/15/16.
 */
public class Mozzarella extends Decorator{


    public Mozzarella(Pizza newIngredient) {
        super(newIngredient);
        System.out.println("Adding Mozzarella\n");
    }

    public String getDescription(){
        return newIngredient.getDescription() + "Mozzarella, ";
    }

    public double getCost(){
        return newIngredient.getCost() + 3.00;
    }

}
