package calculator;
public class Multiplication extends Operation {
    public Multiplication(int a, int b) {
        super(a, b);}
    public int calculate() {
        return Math.multiplyExact(a, b);}
}
