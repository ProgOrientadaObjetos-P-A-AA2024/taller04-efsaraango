/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Auto;

/**
 *
 * @author Det-Pc
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto matri1 = new Auto("1104280977", "Toyota", 2010, 5250);
        matri1.totalValorMatricula();
        
        Auto matri2 = new Auto("1104280977", "Toyota", 5250);
        matri2.totalValorMatricula();

        System.out.printf("%s\n", matri1);
        System.out.printf("%s\n", matri2);
    }

}
