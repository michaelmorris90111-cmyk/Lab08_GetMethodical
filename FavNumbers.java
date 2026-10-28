import java.util.Scanner;

public class FavNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);
        int favInt;
        double favDouble;
        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
    }
}
