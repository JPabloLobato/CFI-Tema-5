package org.example;

import java.util.Arrays;

public class OptimizacionProcesos {

    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int lo, int hi) {
        if(lo >= hi) {
            return;
        }

        int lt = lo, gt = hi;
        int pivot = arr[lo];
        int i = lo + 1;

        while (i <= gt) {
            if (arr[i] < pivot) {
                swap(arr, i++, lt++);
            } else if (arr[i] > pivot) {
                swap(arr, i, gt--);
            } else {
                i++;
            }
        }
        quicksort(arr, lo, lt - 1);
        quicksort(arr, gt + 1, hi);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] fechas = {20230101, 20220417, 20211225, 20221111, 20231031};

        System.out.println ("Fechas sin ordenar: " + Arrays.toString(fechas));
        for(int fecha : fechas) {
            System.out.println(fecha);
        }
        quicksort(fechas);
        System.out.println("Fechas ordenadas: " + Arrays.toString(fechas));
        for(int fecha : fechas) {
            System.out.println(fecha);
        }
    }
}
