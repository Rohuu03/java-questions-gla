import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();

        // Check positive or negative
        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Check divisible by both 5 and 7
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Number is divisible by both 5 and 7");
        } else {
            System.out.println("Number is not divisible by both 5 and 7");
        }
    }
}