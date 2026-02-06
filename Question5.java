import java.util.Scanner;
public class Question5 {
     public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
            System.out.println("Enter the number of units consumed ");
                int units = sc.nextInt();
                    int charges =0;
                    if(units<=100){
                        charges = units*2;
                   }
                  else if (units>100 && units<=200) {
                     charges = (units-100)*3 +100*2;
                    }
                 else if(units>200){
                        charges = (units-200)*5 + 100*2 +100*3;
                    }
                 charges = charges+150;
         System.out.println(charges);
     }
}
