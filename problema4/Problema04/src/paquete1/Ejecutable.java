/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Cheque;

/**
 *
 * @author Det-Pc
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cheque cheque1 = new Cheque("Eduardo Sarango", "Pichincha", 525.25);
        cheque1.comisionBanco();
        Cheque cheque2 = new Cheque("Eduardo Sarango", 800.25);
        cheque2.comisionBanco();

        System.out.printf("%s\n", cheque1);
        System.out.printf("%s\n", cheque2);
    }

}
