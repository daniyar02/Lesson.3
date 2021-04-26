package  com.GEECTECH;

public class Main {

    public  static  void  main(String[] args){
        sayHello();
        sayHello();
        sayHello();

        addition(15,45);
        addition(65,35);
        addition(5,8);

        multyply(5,7);
        System.out.println( multyply(5,8));
        int resultMultiply = multyply(7,10);
        System.out.println(resultMultiply);
        addition(resultMultiply,multyply(4,5));

    }

    public static void sayHello() {
        System.out.println("Hello");
        System.out.println("Geektech");

        System.out.println("Hello");
        System.out.println("Geektech");
    }
    public static  void addition(int numberFirst,int numberSecond){
        System.out.println(numberFirst*numberSecond);
    }

    public static int multyply (int num1,int num2){
        return num1*num2;
    }
    public static  String concat
}

