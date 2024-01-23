/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuliah2;

/**
 *
 * @author user
 */
public class ArithmeticException {
    
    public static void main(String[] args) {
        try {
            int result = divideByHelvy(); // Memanggil metode yang dapat menyebabkan ArithmeticException
            System.out.println("Result: " + result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Error: Pembagian Dengan Nol.");
        }
    }

    private static int divideByHelvy () {
        return 10 / 0; // Pembagian oleh nol akan menyebabkan ArithmeticException
    }
}
