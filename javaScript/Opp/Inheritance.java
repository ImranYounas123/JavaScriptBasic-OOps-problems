package Opp;

public class Inheritance {
    String name = "Imran";
    Inheritance(String std){
        this.name = std;
    }
    public void inheritanceMehtod(){
        System.out.println("Inheritance");
    }
}
class Child1 extends Inheritance{
    Child1(String std2){
    super(std2);
    }
    String lastname = "Younas";
    public void ChildeMethod(){
        System.out.println("Child1 Class");
    }
}
class Child2 extends Child1{
 Child2(String fname){
  super(fname);
 } 
String fname = name;
String lname = lastname;
 public void Child2Method(){
     System.out.println("Full name is "+name+ " " +lastname);
 }
}