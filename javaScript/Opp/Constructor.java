package Opp;
class ConstructorConcept{
int stdage;
String stdname;
   ConstructorConcept(int age,String name ){
    this.stdage = age;   
    this.stdname = name;
    System.out.println("Student name " +stdname+ " Student Age is "+stdage);
}
}
class TypeOfConstructor{
// Defau;r Cons
String name ;
TypeOfConstructor(){
this.name = "Imran Younas";
}
int num1,num2;
TypeOfConstructor(int a, int b){
    this.num1 = a;
    this.num2 = b;
}
public int getAdition() {
    return num1 + num2;
}
}

