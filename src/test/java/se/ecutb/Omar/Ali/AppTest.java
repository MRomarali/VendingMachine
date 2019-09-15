package se.ecutb.Omar.Ali;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Product fruit;
    Product snack;
    Product soda;
    VendingMachineIMPL object;
    @Before
    public void all_arrays_objects(){
    fruit = new Fruits("kiwi", 20, 1, 60, "Contains potassium");
    snack = new Snacks("Marabou", 50, 2, 200, "trace of nuts");
    soda = new Soda("Seven up", 10, 3, 350, "high fructose");
    Product[] test = {fruit, snack, soda };
object = new VendingMachineIMPL(test);
    }

    // Test addCurrency
    @Test
    public void test_add_currency(){
        object.addCurrency(100);
        assertEquals(100, object.getBalance());
    }
    // Test endSession
    @Test
    public void product_request(){
        object.addCurrency(100);
        assertEquals(soda, object.productRequest(3));
    }
    @Test
    public void get_description(){
        String drink = "seven up, price=10.0, productNumber=3, calories=350, Allergies=high fructose";
        assertEquals(drink, object.getDescription(3));
    }
    @Test
    public void get_product(){
        String[] drink = {"kiwi 1","Marabou 2","seven up 3"};
        assertArrayEquals(drink, object.getProducts());

    }
}
