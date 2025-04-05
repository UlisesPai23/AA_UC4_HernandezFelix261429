/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC WHITE WOLF
 */
public class Ordenamientos {
    // Método para ordenar el arreglo utilizando QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encuentra el índice del pivote tal que los elementos más pequeños
            // estén a la izquierda del pivote y los más grandes a la derecha
            int pivotIndex = partition(arr, low, high);
            
            // Recursión: Ordenar las sublistas antes y después del pivote
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Método para dividir el arreglo y devolver el índice del pivote
    private static int partition(int[] arr, int low, int high) {
        // El pivote es el último elemento del arreglo
        int pivot = arr[high];
        int i = low - 1; // Índice del elemento más pequeño

        // Comparar cada elemento con el pivote
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar el pivote con el elemento en arr[i + 1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Retornar el índice del pivote
    }
}
