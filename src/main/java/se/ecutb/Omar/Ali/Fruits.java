package se.ecutb.Omar.Ali;

public class Fruits extends Product {
    public Fruits(String name, double price, int productNumber, int calories, String allergies) {
        super("kiwi", price, productNumber, calories, allergies);
    }

    @Override
    public String use() {
        return "Enjoy your kiwi";
    }

}
