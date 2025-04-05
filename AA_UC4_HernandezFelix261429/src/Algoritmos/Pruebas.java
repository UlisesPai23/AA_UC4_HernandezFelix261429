/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC WHITE WOLF
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = { 10, 7, 8, 9, 1, 5 };

        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        // Llamamos al método QuickSort
        Ordenamientos.quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado:");
        mostrarArreglo(arreglo);
    }

    // Método auxiliar para mostrar el arreglo
    public static void mostrarArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
