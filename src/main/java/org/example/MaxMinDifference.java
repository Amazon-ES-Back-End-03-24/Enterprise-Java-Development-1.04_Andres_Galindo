package org.example;

public class MaxMinDifference {
    public static int maxMinDifference(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("El array debe tener al menos un elemento");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 2, 6, 5};
        int difference = maxMinDifference(array);
        System.out.println("La diferencia entre el valor máximo y mínimo es: " + difference);
    }
}
