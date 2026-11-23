package calculator;
public class Subtraction extends Operation {
    public Subtraction(int a, int b) {
        super(a, b);}
    public int calculate() {
        return Math.subtractExact(a, b);}
}
