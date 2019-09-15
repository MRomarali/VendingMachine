package se.ecutb.Omar.Ali;

public class Soda extends Product {
    public Soda(String name, double price, int productNumber, int calories, String allergies) {
        super("seven up", price, productNumber, calories, allergies);
    }

    @Override
    public String use() {
        return "Enjoy your seven up";
    }

}
