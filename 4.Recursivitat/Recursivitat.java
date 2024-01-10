package com.recursivitat;

public class Recursivitat {
    public static void main(String[] args) {
        int numerador = 24, denominador = 4;
        /* Exercici 1 */
        System.out.println(divisioRecursiva(numerador, denominador));

        /* Exercici 2 */
        System.out.println(sumaDigits(1234));

        float[] vector = {1, 2, 3, 4, 4.5f, -3, 0.5f};
        /* Exercici 3 */
        System.out.println(sumarElementsVector(vector, 0));

        /* Exercici 4 */
        System.out.println(multiplicarElementsVector(vector, 0));

        /* Exercici 6 */
        System.out.println(valorMesPetit(vector, 0, 0));

        float[][] matriu = {{1, 2, 3}, {4, 5, 6, 4}, {1, 2}};
        //System.out.println(sumarElementsMatriu(matriu, matriu.length - 1,matriu[0].length - 1));
        /* Exercici 5 */
        System.out.println(sumarElementsMatriu2(matriu, 0, 0));
    }

    /* Exercici 1 */
    public static int divisioRecursiva(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("ERROR: No es pot dividir per 0!");
            return 0; // Cas base
        } else if (numerador < denominador) {
            return 0; // Cas base
        } else {
            return 1 + divisioRecursiva(numerador - denominador, denominador); // Cas recursiu
        }
    }

    /* Exercici 2 */
    private static int sumaDigits(int num){
        if(num == 0){
            return 0; // Cas base
        } else {
            return sumaDigits(num / 10) + num % 10; // Cas recursiu
        }
    }

    /* Exercici 3 */
    public static float sumarElementsVector(float[] vector, int index) {
        if (index == vector.length) {
            return 0; // Cas base
        } else {
            return vector[index] + sumarElementsVector(vector, index + 1); // Cas recursiu
        }
    }

    /* Exercici 4 */
    public static float multiplicarElementsVector(float[] vector, int index) {
        if (index == vector.length) {
            return 1; // Cas base
        } else {
            return vector[index] * multiplicarElementsVector(vector, index + 1); // Cas recursiu
        }
    }

    /* Exercici 5  */
    public static float sumarElementsMatriu2(float[][] matriu, int fila, int columna) {
        if (fila == matriu.length) {
            return 0; // Cas base
        } else if (fila < matriu.length && columna == matriu[fila].length) {
            return 0 + sumarElementsMatriu2(matriu, fila + 1, 0); // Cas recursiu
        } else {
            return matriu[fila][columna] + sumarElementsMatriu2(matriu, fila, columna + 1); // Cas recursiu
        }
    }

    /* Exercici 6 */
    public static float valorMesPetit(float[] vector, float valor, int index) {
        if (index == 0) {
            valor = vector[index];
            return valorMesPetit(vector, valor, index + 1); // Cas recursiu
        } else if (index == vector.length) {
            return valor; // Cas base
        } else {
            if (vector[index] < valor) {
                valor = vector[index];
            }
            return valorMesPetit(vector, valor, index + 1); // Cas recursiu
        }
    }

    public static float sumarElementsMatriu(float[][] matriu, int fila, int columna) {
        if (fila < 0) {
            return 0;
        } else if (fila >= 0 && columna < 0) {
            return 0 + sumarElementsMatriu(matriu, fila - 1, matriu[0].length - 1);
        } else {
            return matriu[fila][columna] + sumarElementsMatriu(matriu, fila, columna - 1);
        }
    }

}
