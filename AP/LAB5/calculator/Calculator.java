package calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int x = sc.nextInt();
        System.out.print("Enter num: ");
        int y = sc.nextInt();
        System.out.println("Choose operation: +  -  *  /");
        char choice = sc.next().charAt(0);
        Operation op;
        switch (choice) {
            case '+':
                op = new Addition(x, y);
                break;
            case '-':
                op = new Subtraction(x, y);
                break;
            case '*':
                op = new Multiplication(x, y);
                break;
            case '/':
                op = new Division(x, y);
                break;
            default:
                System.out.println("Invalid operation");
                sc.close();
                return;}
        System.out.println("Result: " + op.calculate());
        sc.close();}
}
