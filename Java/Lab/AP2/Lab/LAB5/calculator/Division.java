package calculator;
public class Division extends Operation {
    public Division(int a, int b) {
        super(a, b);}
    public int calculate() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");}
        return a / b;}
}