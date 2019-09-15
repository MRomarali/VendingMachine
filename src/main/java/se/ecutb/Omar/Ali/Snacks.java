package se.ecutb.Omar.Ali;

public class Snacks extends Product {
    public Snacks(String name, double price, int productNumber, int calories, String allergies) {
        super("Marabou", price, productNumber, calories, allergies);
    }

    @Override
    public String use() {
        return "Enjoy your Marabou";
    }
}
