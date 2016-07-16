
public class Main {
    public static void main (String args []) {
        Pizza Cliente1 = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println(Cliente1.getDescription());
        System.out.println(Cliente1.getCost());


    }
}