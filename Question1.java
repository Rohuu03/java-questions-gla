
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of items purchased");
        int quantity = sc.nextInt();
        System.out.println("Enter the price per item");
        float price = sc.nextFloat();
        float bill = quantity * price;

        if (bill >= 5000) {
            bill = bill - (bill * 0.10f); // 10% discount
        } else if (bill >= 2000) {
            bill = bill - (bill * 0.05f); // 5% discount
        }

        float finalBill = bill * 1.18f; // add 18% GST
        System.out.println("Final payable amount is: " + finalBill);

        sc.close();
    }
}
