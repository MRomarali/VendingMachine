package se.ecutb.Omar.Ali;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[0];
        Fruits fruit = new Fruits("kiwi", 20, 1, 60, "Contains potassium");
        Snacks snack = new Snacks("Marabou", 50, 2, 200, "trace of nuts");
        Soda soda = new Soda("Seven up", 10, 3, 350, "high fructose");
        VendingMachineIMPL vm = new VendingMachineIMPL(product);
        Scanner input = new Scanner(System.in);
        int choice = 0 ;
        int amount = 0;
        System.out.println("Enter amount");
        amount = input.nextInt();
        vm.addCurrency(amount);
        System.out.println("\n\nPlease enter your selection:"
                + "\n1: fruits \t 20kr"
                + "\n2: soda \t 50kr"
                + "\n3: snack \t 10kr"
                + "\n4: Exit ");
        choice = input.nextInt();
        boolean keepAlive = true;
        while (keepAlive){
        if (choice == 1) {
            System.out.println("Choose item " + fruit.getName() + " by typing 1");
            choice = input.nextInt();
            if (choice == 1) {
                    System.out.println("change back: ");
                    System.out.println(vm.endSession() - fruit.getPrice() + " kr:- ");
                    System.out.println(fruit.use());
                    keepAlive = false;
                if (choice != 1) {
                    System.out.println("something went wrong");
                    break;
                }
            }
        }
        if (choice == 2) {
            System.out.println("Choose item " + snack.getName() + " by typing 2");
            choice = input.nextInt();
            if (choice == 2) {
                System.out.println("change back: ");
                System.out.println(vm.endSession() - snack.getPrice() + " kr:- ");
                System.out.println(snack.use());
                keepAlive = false;
            }
            if (choice != 2) {
                System.out.println("something went wrong");
                break;
            }

        }
        if (choice == 3) {
            System.out.println("Choose item " + soda.getName() + "by typing 3");
            choice = input.nextInt();
            if (choice == 3) {
                System.out.println("change back: ");
                System.out.println(vm.endSession() - soda.getPrice() + " kr:- ");
                System.out.println(soda.use());
                keepAlive = false;
            }
            if (choice !=3) {
                System.out.println("Something went wrong");
                break;
            }
        }
            if (choice == 4) {
                System.out.println("change back: ");
                System.out.println(vm.endSession() + " kr:- ");
                System.out.println("Exiting........");
                keepAlive = false;
            }
        }
    }
}
