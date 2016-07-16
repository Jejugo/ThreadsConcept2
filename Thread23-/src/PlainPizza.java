/**
 * Created by jeffgoes on 6/15/16.
 */
public class PlainPizza implements Pizza {

    public PlainPizza(){
        System.out.println("Addin Dough...");
    }

    @Override
    public String getDescription() {
        return "Dough, ";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
