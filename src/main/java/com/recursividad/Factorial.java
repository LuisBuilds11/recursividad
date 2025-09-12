package com.recursividad;

public class Factorial {
    public static int CalcFactorial(int x) {
        if (x > 1) {
            return MultiplicaRecursivo(x, CalcFactorial(x - 1));
            // return x * CalcFactorial(x - 1);
        } else {
            return 1;
        }
    }

    public static int MultiplicaRecursivo(int a, int b) {
        if (b > 1) {
            return a + MultiplicaRecursivo(a, b - 1);
        } else if (b == 1) {
            return a;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("El factorial es " + CalcFactorial(6));
        System.out.println("El factorial es " + CalcFactorial(5));
        System.out.println("El factorial es " + CalcFactorial(4));
    }
}
