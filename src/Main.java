import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("please insert the first number ?");
       int  firstNumber = scan.nextInt();
        System.out.println("please insert the second number ?");
        int  secondNumber = scan.nextInt();


            int additionValue =  addition(23,26);
            int subValue =  (int) subtraction(firstNumber, secondNumber);

            multiply(additionValue,subValue);
       // System.out.println(additionValue*subValue);

        System.out.println();




    }

   // returnType methodName(){
        // code method body
  //  }


    static int addition(int value1, int value2){

        return  (value1+value2);
    }

    static float subtraction(int value1, int value2){

        return (value1-value2);
    }
   static  void multiply(int v1, int v2){

      System.out.println(v1 * v2);

    }



//    static String greet(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("please insert your name ?");
//        String name = input.next();
//        return "hello "+name;
//    }
}