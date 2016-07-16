/**
 * Created by jeffgoes on 6/15/16.
 */
public class TomatoSauce extends Decorator{

    public TomatoSauce(Pizza newIngredient) {
        super(newIngredient);
        System.out.println("Adding Tomato Sauce...");
    }

    public String getDescription (){
        return newIngredient.getDescription() + "Tomato Sauce.";
    }

    public double getCost(){
        return newIngredient.getCost() + 1.50;
    }
}
