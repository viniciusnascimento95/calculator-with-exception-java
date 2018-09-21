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
public class Calculator {

    protected double Number1;
    protected double Number2;

    //Class Construtor
    public Calculator() {
        Number1 = 0.0;
        Number2 = 0.0;
    }

    public Calculator(double Number1, double Number2) {
        this.Number1 = Number1;
        this.Number2 = Number2;
    }

    public double Sum() {
        return this.Number1 + this.Number2;
    }

    //Add exeption error in class numeric basic
    public double Sum(double Number1, double Number2) throws Exception {
        if (Number1 < 0 || Number2 < 0) {
            Exception erro = new Exception();
            throw erro;

        } else {
            return Number1 + Number2;
        }

    }

    public double Sub() {
        return this.Number1 - this.Number2;
    }

    public double Sub(double Number1, double Number2) {
        return Number1 - Number2;
    }

    public double Division() throws ArithmeticException {
        if (this.Number1 == 0 || this.Number2 == 0) {
            ArithmeticException nodivision = new ArithmeticException();
            System.out.println("not division");
            throw nodivision;
        } else {
            return this.Number1 / this.Number2;
        }

    }

    public double Division(double Number1, double Number2) {
        return Number1 / Number2;
    }

    public double Multiply() {
        return this.Number1 * this.Number2;
    }

    public double Multiply(double Number1, double Number2) {
        return Number1 * Number2;
    }

}