package calculator;
public class Addition extends Operation {
    public Addition(int a, int b) {
        super(a, b);}
    public int calculate() {
        return Math.addExact(a, b);}
}
