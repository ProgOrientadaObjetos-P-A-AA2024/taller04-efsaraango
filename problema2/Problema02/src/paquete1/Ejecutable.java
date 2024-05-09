/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.SueldoProfesor;

/**
 *
 * @author Det-Pc
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SueldoProfesor sueldo1 = new SueldoProfesor("Eduardo", "Sarango", "1104280977", 380);
        sueldo1.calcularSueldoTotal();

        SueldoProfesor sueldo2 = new SueldoProfesor("Francisco", "Ajila", "0104280977");
        sueldo2.calcularSueldoTotal();

        System.out.printf("%s\n", sueldo1);
        System.out.printf("%s\n", sueldo2);
    }

}
