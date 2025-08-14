/*
Test for Overriding
Make a function with the same return type , name of the function, number and type of
arguments in the Child class as they are in the Mother class. Change the string to be
displayed on the screen. For example, if Mother class version of show ( ) was displaying
"Hello World" then the child class version of show ( ) will display "Hello JUET". Run the
application class and discuss the results obtained with your instructor.
*/
class Mother {
    void show() {
        System.out.println("Hi");}
}
class Child extends Mother {
    void show() {
        System.out.println("JUET");}
}
class Overriding {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();}
}