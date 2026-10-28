import java.util.Scanner;
public class Reggie {
    static void main() {
        String sSN;
        String ucStudentNumber;
        String menuChoice;
        Scanner in = new Scanner(System.in);
        sSN = SafeInput.getRegExString(in, "Please enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println(sSN);
        ucStudentNumber = SafeInput.getRegExString(in, "Please enter your UC Student Number","^(M|m)\\d{8}$");
        System.out.println(ucStudentNumber);
        menuChoice = SafeInput.getRegExString(in, "Please enter your menu choice (O=Open,S=Save,V=View,Q=Quit)","^[OoSsVvQq]$");
        System.out.println(menuChoice);
    }

}
