import java.util.Scanner;
class MaxWithoutComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Difference
        int diff = a - b;

        // Extract sign bit (0 if positive, 1 if negative)
        int sign = (diff >> 31) & 1;

        // If sign = 0 → a >= b → result = a
        // If sign = 1 → a < b  → result = b
        int max = a * (1 - sign) + b * sign;

        System.out.println("Maximum: " + max);
    }
}