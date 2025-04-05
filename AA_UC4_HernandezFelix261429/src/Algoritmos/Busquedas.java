/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC WHITE WOLF
 */
public class Busquedas {
    // Método para buscar un valor en un arreglo (búsqueda lineal)
    public static int busquedaLineal(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i; // Retorna el índice del valor encontrado
            }
        }
        return -1; // Si no se encuentra el valor, retorna -1
    }
}
