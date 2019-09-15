package se.ecutb.Omar.Ali;

public abstract class Product {
    private String name;
    private double price;
    private int productNumber;
    private int calories;
    private String Allergies;

    public Product(String name, double price, int productNumber, int calories, String allergies) {
        this.name = name;
        this.price = price;
        this.productNumber = productNumber;
        this.calories = calories;
        Allergies = allergies;
    }

    public String examine(){
        String info = name +
                ", price=" + price +
                ", productNumber=" + productNumber +
                ", calories=" + calories +
                ", Allergies=" + Allergies;

        return info;
    }

    public String showProducts(){
        String show = "Product "+name +"With product number"+ " " + productNumber;
        return show;
    }
    public abstract String use();


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getCalories() {
        return calories;
    }

    public String getAllergies() {
        return Allergies;
    }
}
