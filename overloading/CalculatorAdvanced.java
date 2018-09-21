/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ThinkPad
 */
public class CalculatorAdvanced extends Calculator {
    
    public CalculatorAdvanced(double Number1, double Number2) {
        this.Number1 = Number1;
        this.Number2 = Number2;
        
    }
    
    public CalculatorAdvanced() {
        super();
    }

    //square root
    public double squareroot() {
        return Math.sqrt(super.Number1);
    }
    
    public double squareroot(double Number) {
        return Math.sqrt(Number);
        
    }

    //exponentiation of number
    public double Exp() {
        return Math.exp(super.Number1);
    }

    public double Exp(double Number) {
        return Math.exp(Number);
        
    }

    //SIN
    public double Sin() {
        return Math.sin(super.Number1);
    }

    public double Sin(double Number) {
        return Math.sin(Number);
        
    }

    //Cos number
    public double Cos() {
        return Math.cos(Number1);
    }

    public double Cos(double Number) {
        return Math.cos(Number);
        
    }

    //Tang number
    public double Tang() {
        return Math.tan(Number1);
    }

    public double Tang(double Number) {
        return Math.tan(Number);
    }
    
}
