package se.ecutb.Omar.Ali;

/**
 * Hello world!
 *
 */
public interface VendingMachine
{
    void addCurrency(int amount);// Adds to the moneyPool
    Product productRequest(int productNumber);// buy a product
    int endSession();// return change and nullify the moneyPool
    String getDescription(int productNumber);// product description
    int getBalance(); // return moneyPool
    String[] getProducts(); // return all products name and product number
}
