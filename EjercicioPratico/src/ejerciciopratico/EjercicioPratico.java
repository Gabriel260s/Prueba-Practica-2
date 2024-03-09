/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopratico;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class EjercicioPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String mensaje = input.nextLine();
        mensaje = mensaje.toLowerCase();
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if ((caracter >= 'a' && caracter <= 'z')) {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println(caracter + " = vocal.");
                } else {
                    System.out.println(caracter + " = consonante");
                }
            } else if (caracter >= '0' && caracter <= '9') {
                System.out.println(caracter + " = numero");
            } else {
                System.out.println(caracter + " = signo");
            }
        }
    }

}

