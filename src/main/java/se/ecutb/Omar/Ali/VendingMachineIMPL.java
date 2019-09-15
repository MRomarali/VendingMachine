package se.ecutb.Omar.Ali;

import java.util.Arrays;

public class VendingMachineIMPL implements VendingMachine {
    private Product[] product = new Product[0];
    private int moneyPool;
    
    public VendingMachineIMPL(Product[] product) {
        this.product = product;
        this.moneyPool = moneyPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
    int[] acceptedCurrency = {1,5,10,20,50,100,500,1000};
    // Check if amount equals to accepted currency
        for ( int currency: acceptedCurrency) {
            if (amount == currency) {
                    moneyPool += amount;
            }
       }
    }
    private Product findProduct(int productNumber){
        for (Product products: product) {
            if (products.getProductNumber() == productNumber) {
                return products;
            }
        }
        return null;
    }

    @Override
    public Product productRequest(int productNumber) {
        Product product = findProduct(productNumber);
        if (product.getPrice() > moneyPool) {
            return null;
        }
        moneyPool -= product.getPrice();
            return product;
    }

    @Override
    public int endSession() {
        int change = moneyPool;
        moneyPool = 0;
        return change;
    }


    @Override
    public String getDescription(int productNumber) {
        Product product = findProduct(productNumber);
        // if product equals null
        if (product == null) {
            System.out.println("Can't find product");
        }
        return product.examine();
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts()
    {
        // skapar String array som innehåller produkt arrayens längd
        String[] showProducts = new String[product.length];
        // loopar igenom produkt arrayen
        for (int i = 0; i < product.length; i++) {
            showProducts[i] = product[i].showProducts();// produktens index läggs till i den skapade metoden showProducs
        }
        return showProducts;
    }
}
