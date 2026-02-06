import java.util.Scanner;

class SubtractionWithoutMinus {

    // Function to add two numbers using bitwise operators
    static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;   // AND gives carry
            x = x ^ y;           // XOR gives sum without carry
            y = carry << 1;      // shift carry left
        }
        return x;
    }

    // Function to subtract using two's complement
    static int subtract(int a, int b) {
        // Two's complement of b = ~b + 1
        int twosComplement = add(~b, 1);

        // a - b = a + (two's complement of b)
        return add(a, twosComplement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = subtract(a, b);

        System.out.println("Result: " + result);
    }
}