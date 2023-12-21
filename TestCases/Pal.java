import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int num = s.nextInt();

        String number = String.valueOf(num);

        String reverse = new StringBuilder(number).reverse().toString();

        if (number.equals(reverse)) {
            System.out.println(num + " is a Palindrome number.");
        }
        else {
            System.out.println(num + " isn't a palindrome number.");
        }
    }
}
