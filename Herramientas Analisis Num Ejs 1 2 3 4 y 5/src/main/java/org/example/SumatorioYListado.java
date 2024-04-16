package org.example;

    // Ej 1: Sumatorio de los primeros n números naturales
    public class SumatorioYListado {
    public static int sumatorio(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + sumatorio(n - 1);
        }
    }

    // Ej 2: Listar números en un rango [inicio, fin]
    public static void listarNumeros(int inicio, int fin, StringBuilder sb) {
        if (inicio <= fin) {
            sb.append(inicio).append(" ");
            listarNumeros(inicio + 1, fin, sb);
        }
    }

    // Ej 3: Cálculo de Potencias (base^exponente)
    public static int potencia(int base, int exponente) {
        if(exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // Ej 4: Cálculo de Factorial
    public static int encontrarMaximo(int[] datos, int n) {
        if (n == 1) {
            return datos[0];
        } else {
            return Math.max(datos[n - 1], encontrarMaximo(datos, n - 1));
        }
    }

    // Ej 5: Cálculo de Promedio
    public static double calcularPromedio(int[] datos, int n) {
        return (double) sumatoriaArray(datos, n) / n;
    }

    private static int sumatoriaArray(int[] datos, int n) {
        if(n == 1) {
            return datos[0];
        } else {
            return datos[n - 1] + sumatoriaArray(datos, n - 1);
        }
    }
}
