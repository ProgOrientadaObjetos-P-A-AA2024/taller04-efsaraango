/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.LibretaNotas;

/**
 *
 * @author Det-Pc
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Rene", 10, 10, 9);
        libreta1.establecerPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Eduard", 8, 8);
        libreta2.establecerPromedio();
        
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
        
    }
    
}
