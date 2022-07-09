import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int a = 20;
        System.out.println("Hello Java with Imran " + a);
        Basics obj = new Basics();
        // obj.Variable();
        // obj.TypeCasting();
        // obj.Operators();
        // obj.SwitchCase();
        // obj.ConditionIFElse();
        // obj.forLoop();
        obj.TakeInput();
    }
}

class Basics {
    public void Variable() {
        int a = 10;
        String str = "Imran Younas";
        float flt = 0.0f;
        double dblr = 0.1212;
        System.out.println("Integer " + a + "\n String " + str + "\n float " + flt + "\n Double " + dblr);
    }

    public void TypeCasting() {
        // Widening Data tyoeCasting
        int intval = 10;
        double num = intval;
        System.out.println(num);
        // WNarrow Data tyoeCasting
        double dble = 10.2;
        int con = (int) dble;
        System.out.println(con);
        // Covert int into String
        int val = 100;
        System.out.println("Int value  : " + val);
        String toStr = String.valueOf(val);
        System.out.println("String value after Conveting  : " + toStr);
        // Covert String into int
        String str = "100";
        System.out.println("Strin value  : " + str);
        int toInt = Integer.parseInt(str);
        System.out.println("Int value after Conveting  : " + toInt);
    }
    public void Operators(){
        // 1. unary operator ++ or --:
        int num1 = 10;
        int num2 = 10;
        System.out.println("num1 = num1 + 1 => " +(num1 = num1 + 1)+ " num1 ++  => "+(num1 ++));
        System.out.println("num2 = num2 - 1 => " +(num2 = num2 - 1)+ " num2 --  => "+(num2 --));
        // Arithmetic Operator + , - , * , % , /,
        int num3 = 243121;
        int num4 = 13;
        System.out.println(num3 % num4);
        int num5 = num3 / num4;
        double num6 = num5;
        System.out.println(num6);
        // Comparesion anfd logics <,>
        int val1 = 10;
        int val2 = 20;
        System.out.println(val1 == val2);
    }
    public void SwitchCase(){
        int a = 210;
 switch (a) {
     case 10:
     System.out.println("Hello Imran");
         break;
    case 20:
    System.out.println("Hello Hasnain");
        break;
     default:
    System.out.println("Hello Imran again");
         break;
 } 
    }
    public void ConditionIFElse(){
        int a = 20;
        int b = 30;
        if (a == 20 && b != 20) {
            System.out.println("Ok ...");
        } else {
            System.out.println(" Not Ok ...");
        }
    }
    public void forLoop(){
        for(int i = 1; i <=10; i++){
            System.out.println(i*6);
        }
        int a = 10;
        while (a >= 1) {
    System.out.println(a);
        a--;
}
    }
public void TakeInput(){
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Num");
    int a =  sc.nextInt();
    System.out.println("Enter first Num");
    int b =  sc.nextInt();
    System.out.println("Addition of two Num is " +(a + b));


}



}