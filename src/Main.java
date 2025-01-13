//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    //Mid-Level Developer
    //Build The Multiply Function here
    public static void multi(int a, int b){
        int r = a * b;
        System.out.println("number1 * number2 = " + r);
    }
    public static void multi(double a, double b){
        double r = a * b;
        System.out.println("number1 * number2 = " + r);
    }
    //Build The Divide Function here
    public static void divie(int a, int b){
        if(b == 0){
            System.out.println("'Wrong!' divied by zero");
        }
        else{
            int r = a / b;
            System.out.println("number1 / number2 = " + r);
        }
    }
    public static void divie(double a, double b){
        if(b == 0){
            System.out.println("'Wrong!' divied by zero");
        }
        else{
            double r = a / b;
            System.out.println("number1 / number2 = " + r);
        }
    }
    //Build The Module Function here
    public static void module(int a, int b){

        double r = a % b;
        System.out.println("number1 % number2 = " + r);

    }
    public static void divie(double a, double b){
        double r = a % b;
        System.out.println("number1 % number2 = " + r);

    }
    //Junior Developer
    //Build The Addition Function here
    //Build The Subtraction Function here

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator - Version V0.0");
        System.out.print("Please Enter The Calculation Type: ");
        char type = sc.next().charAt(0);
        System.out.print("Please Enter The First Number: ");
        double number1 = sc.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        double number2 = sc.nextDouble();



    }
}