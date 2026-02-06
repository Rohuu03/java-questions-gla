import java.util.Scanner;

class MultiplyBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // x * 7 = (x << 3) - x
        int result = (x << 3) - x;

        System.out.println("Result: " + result);
    }
}