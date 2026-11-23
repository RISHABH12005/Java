class A {
    int a = 10;
}
class B extends A {
    int A = 20;
    void fun() {
        System.out.println(super.a);
    }
}
public class Superclass {
    public static void main(String[] ar) {
        B obj = new B();
        obj.fun();
    }
}
