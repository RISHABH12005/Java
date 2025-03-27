/*
Write a program in Java to print the table of a number received through command 
line argument, e.g. 
If user gives 4 through command line argument, the program should print:
4 x 1= 4
4 x 2= 8
............
4x10= 40
Hint. Command line arguments are passed at the time of executing a java program, 
e.g. if we pass command line argument in the class First in our first problem, we 
would have done something like this : java First cat Here, cat will be passed as an 
argument and will be collected at the args[0] array of string
*/

public class Table {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
