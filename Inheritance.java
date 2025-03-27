/*
Test for Inheritance
Make a class Mother with int x and void show ( ) as its members.
Now create another class Child that is derived from the Mother class.
Create another class Application to test the inheritance.
class Mother {.......}
class Child extends Mother {// Empty Body }
Note: "//" is used for single line comments in java.
class Application {
public static void main (String args[]){
Mother m= new Mother ( );
m.show( ); // show of Mother is called
Child ch=new Child ( );
ch. show ( ); // show ( ) inherited in Child from Mother is called
}
}
*/
class Mother {
    int x = 10;
    void show() {
        System.out.println("Hi");}
}
class Child extends Mother {}
class Inheritance{
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();}
}