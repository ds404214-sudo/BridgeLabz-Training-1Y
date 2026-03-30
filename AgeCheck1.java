import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 0) {
            System.out.println("Invalid age!");
        } else if (age >= 18) {
            System.out.println("Age is 18 or above. Eligible!");
        } else {
            System.out.println("Age below 18. Not eligible.");
        }
        
        scanner.close();
    }
}
