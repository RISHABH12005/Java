import java.util.Scanner;

public class sqroot{
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + sqrt);
        sc.close();
    }
}
