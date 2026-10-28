import java.util.Scanner;

public class CheckOut {
    static void main() {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        System.out.println("Welcome to the checkout of the $10 store!");
        boolean done;
        do {
            itemPrice = itemPrice + SafeInput.getRangedDouble(in, "What is the price of your item?", .5, 10);
            done = SafeInput.getYNConfirm(in, "Do you have another item (Y/N)?");

        } while (done == true);
        System.out.printf("Your total is $%.2f\n", itemPrice);
    }
}
