/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliah2;

/**
 *
 * @author user
 */
public class NullPointerException {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Memanggil metode pada objek null akan menyebabkan NullPointerException
            System.out.println("Length: " + length);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Error: Trying to access a method or field on a null object.");
        }
    }
}
 

