import java.util.Scanner;
public class BasicCal {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter num: ");
        double n2 = sc.nextDouble();
        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;}
                  else {
                    System.out.println("Error: Division by 0");
                    sc.close();
                    return;}
                break;
            default:
                System.out.println("Invalid operation");
                sc.close();
                return;}
        System.out.println("Result: " + result);
        sc.close();}
}
