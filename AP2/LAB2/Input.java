import java.util.Scanner;
class Input {
 public static void main(String[] args) {
  Scanner A= new Scanner(System.in);
  System.out.println("Enter Name, Age, Chracter");
  String S = A.nextLine();
  int N = A.nextInt();
  char C = A.next().charAt(0);
  System.out.println("Name: "+S);
  System.out.println("Age: "+N);
  System.out.println("Chracter: "+C);}
}