
import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = SafeInput.getInt(in, "Enter a whole number");

        System.out.println("You entered: " + number);
    }
}


