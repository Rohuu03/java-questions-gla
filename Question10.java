
import java.util.Scanner;
class LoginAuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String predefinedUser = "admin";
        String predefinedPass = "12345";
        boolean success = false;
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            if (user.equals(predefinedUser) && pass.equals(predefinedPass)) {
                System.out.println("Login Successful! Welcome, " + user + ".");
                success = true;
                break;
            } else {
                System.out.println("Invalid credentials. Attempt " + attempt + " of 3.");
            }
        }
        if (!success) {
            System.out.println("\nAccount Locked! Too many failed attempts.");
        }
    }
}
