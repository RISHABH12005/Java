class A{
    int a;
    void init1(){
        System.out.println("parent::init");
        a = 10;}
}
class B extends A{
    int a;
    void init2(){
        System.out.println("child::init");
        a=20;
    }
    void fun(){
        System.out.println("a");
        System.out.println(super.a);}
}
class Testsuper{
    public static void main(String[] ar){
        B ob=new B();
        ob.init1();
        ob.init2();
        ob.fun();}
}