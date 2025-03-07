/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.githubdespliegue;

/**
 * Clase Calculadora que proporciona métodos para realizar operaciones
 * matemáticas básicas.
 *
 * @author Pablo Ruiz Ramos
 * @version 1.0
 * @since 2025
 */
public class Calculadora {

    /**
     * Constructor de la clase Calculadora.
     */
    public Calculadora() {
        // Constructor vacío
    }
    
    /**
     * Realiza la suma de dos números cualesquiera.
     *
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return La suma de a y b.
     */
    public static float sumar(float a, float b) {
        return a + b +2;
    }

    /**
     * Realiza la resta de dos números cualesquiera.
     *
     * @param a Primer número a restar.
     * @param b Segundo número a restar.
     * @return La resta de a y b.
     */
    public static float restar(float a, float b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números cualesquiera.
     *
     * @param a Primer número a multiplicar.
     * @param b Segundo número a multiplicar.
     * @return La multiplicación de a y b.
     */
    public static float multiplicar(float a, float b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números cualesquiera.
     *
     * @param a Dividendo.
     * @param b Divisor. No debe ser 0.
     * @return El cociente de la división de a entre b.
     * @throws ArithmeticException si b es igual a 0.
     */
    public float dividir(float a, float b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
    
     /**
     * Calcula la potencia de un número.
     * Este método utiliza internamente el método {@link #multiplicar(float, float)}.
     * @param base Base de la potencia.
     * @param exponente Exponente al que elevar la base.
     * @return El resultado de base elevado a exponente.
     */
    public float calcularPotencia(float base, float exponente) {
        float resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = multiplicar(resultado, base);
        }
        return resultado;
    }
    
    /**
     * Calcula el promedio de un conjunto de números.
     * @param numeros Un array de números.
     * @return El promedio de los números.
     */
    public float calcularPromedio(float[] numeros) {
        float suma = 0;
        for (float num : numeros) {
            suma += num;
        }
        return (float) suma / numeros.length;
    }
}