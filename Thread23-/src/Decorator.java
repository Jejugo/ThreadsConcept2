/**
 * Created by jeffgoes on 6/15/16.
 */
abstract public class Decorator implements Pizza {
    Pizza newIngredient;

    public Decorator (Pizza newIngredient){

        this.newIngredient = newIngredient;
    }

    @Override
    public String getDescription() {

        return newIngredient.getDescription();
    }

    @Override
    public double getCost() {

        return newIngredient.getCost();
    }
}
