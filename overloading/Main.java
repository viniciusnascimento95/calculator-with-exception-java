/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double val1 = 0;
        double val2 = 0;
        double Adva_number = 0;
        Scanner read = new Scanner(System.in);

        Calculator obj = new Calculator();
        CalculatorAdvanced obj1 = new CalculatorAdvanced();
        System.out.print("Info number 1: ");
        val1 = read.nextDouble();
        System.out.print("Info number2: ");
        val2 = read.nextDouble();
        System.out.println("Sum of Number1 and Number 2: " + obj.Sum(val1, val2));
        System.out.println("Sub of Numer1 and Number 2: " + obj.Sub(val1, val2));
        System.out.println("division of Number 1 and Number 2: " + obj.Division(val1, val2));
        System.out.println("Multiply of Number1 and Number 2 :" + obj.Multiply(val1, val2));

        /*
         System.out.println("#####################");
         System.out.println("Calculater advanced");
         System.out.println("Infor a number");
         Adva_number = read.nextDouble();
         System.out.println("squareroot number :" + obj1.squareroot(Adva_number));
         System.out.println("exponentiation of number:" + obj1.Exp(Adva_number));
         System.out.println("Sin of number :" + obj1.Sin(Adva_number));
         System.out.println("Cos of number" + obj1.Cos(Adva_number));
         System.out.println("Tang of number: " + obj1.Tang(Adva_number));
         */
    }

}
