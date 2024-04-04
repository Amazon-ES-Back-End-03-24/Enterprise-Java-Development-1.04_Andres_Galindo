package org.example;

public class Funcion {
    public static double calculateExpression(double x, double y) {
        double result = Math.pow(x, 2) + Math.pow(((4 * y) / 5 - x), 2);
        return result;
    }

    public static void main(String[] args) {
        double x = 3.5;
        double y = 2.0;
        double result = calculateExpression(x, y);
        System.out.println("El resultado de la expresión matemática es: " + result);
    }
}
