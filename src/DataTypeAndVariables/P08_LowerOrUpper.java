package DataTypeAndVariables;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letter)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(letter)) {
            System.out.println("lower-case");
        }
    }
}
