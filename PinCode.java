import java.util.*;
import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {
        System.out.println("Pin Code Validation Logic");
        Scanner scan = new Scanner(System.in);
        String expression = "^[0-9]{6,6}$";
        System.out.print("Please Enter PIN code: ");
        String pin = scan.next();
        if(Pattern.matches(expression, pin))
            System.out.println("PIN Code Succesfully Valid");
        else
            System.out.println("PIN Code is InValid");
    }
}
