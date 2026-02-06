import java.util.Scanner;
public class Question4 {
    static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 =sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();

        System.out.println(" enter the operation you want to perform \n  1 for addition \n 2 for substraction \n 3 for multiplication \n 4 for division \n 5 for remainder");
            int operation = sc.nextInt();
            switch (operation){
                case 1:
                    System.out.println(num1 +num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num1/num2);
                    break;
                case 5:
                    System.out.println(num1%num2);
                break;
        }



    }

}
