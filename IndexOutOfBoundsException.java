/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliah2;

/**
 *
 * @author user
 */
public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int value = array[5]; // Mengakses indeks di luar batas ukuran array akan menyebabkan IndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        }
    }
}