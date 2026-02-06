    import java.util.Scanner;
    public class Question2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter basic salary");
            float basic = sc.nextFloat();
            float hra, da;

            if (basic >= 30000) {
                hra = basic * 0.20f;
                da = basic * 0.15f;
            } else {
                hra = basic * 0.10f;
                da = basic * 0.08f;
            }

            float pf = basic * 0.12f;
            float netSalary = basic + hra + da - pf;
            System.out.println("Net Salary: " + netSalary);

            sc.close();
        }
    }

