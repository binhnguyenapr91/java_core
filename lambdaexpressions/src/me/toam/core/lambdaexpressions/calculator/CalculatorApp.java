package me.toam.core.lambdaexpressions.calculator;
/**
 * @author: Binh Nguyen
 *
 * Sep 22, 2020
 */
 
public class CalculatorApp {
    interface IntegerMath {
        int operation(int a, int b);
    }

    int operateBinary(int a, int b, IntegerMath op){
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        CalculatorApp calculatorApp = new CalculatorApp();

        IntegerMath add = new IntegerMath() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        IntegerMath subtract = new IntegerMath() {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        };

        System.out.println("===");
        System.out.println("Using lambda Expression");
        IntegerMath multiply = (a, b) -> a * b;

        System.out.println("1 + 1 = " + calculatorApp.operateBinary(1,1, add));
        System.out.println("2 - 1 = " + calculatorApp.operateBinary(2,1, subtract));
        System.out.println("2 * 2 = " + calculatorApp.operateBinary(1,2, multiply));
    }

}
