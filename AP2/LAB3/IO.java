//InheritanceOverriding
class parent{
 void hi(){
  System.out.println("parent");}
}
class child extends parent{
  void hi(){
   System.out.println("child");}
 }
public class IO{
 public static void main(String[] a){
  parent p = new parent();
  p.hi();
  child c = new child();
  c.hi();}
}