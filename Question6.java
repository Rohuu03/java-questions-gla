import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the account balance");
        float accbal =sc.nextFloat();//taken the total amount.
        System.out.println("Enter the amount to withdraw");
        int withdraw = sc.nextInt();
        sc.close();
        if(withdraw%100==0 &&(accbal -withdraw)>1000){
            System.out.println("Success!");
        }
        else{
            System.out.println("Failure!");
        }
    }
}