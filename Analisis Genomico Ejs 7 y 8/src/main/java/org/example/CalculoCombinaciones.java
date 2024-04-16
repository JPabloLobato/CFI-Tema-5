package org.example;

public class CalculoCombinaciones {
    public static int calcularCombinacionesUnicas(int codones) {
        if (codones == 0) {
            return 1;
        } else {
            return codones;
        }
    }
}
