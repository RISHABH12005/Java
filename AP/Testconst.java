class A{
int a,b;
A(){//initialize data members}
}class B extends A{
int a;
B(){//initialize data members
void fun(){
System.out.println("A::a:"+super.a+"b="+b+"B::"+a);}
}
class Testconst{
public static void main (String ar[]){
B obj =new B();
obj.fun();}
}