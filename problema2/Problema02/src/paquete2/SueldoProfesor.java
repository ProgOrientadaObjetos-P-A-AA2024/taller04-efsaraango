/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;

/**
 *
 * @author Det-Pc
 */
public class SueldoProfesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public SueldoProfesor(String n, String a, String c, double suBasi) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = suBasi;
    }
    
    public SueldoProfesor(String n, String a, String c) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = 350;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double d) {
        sueldoBasico = d;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    @Override
    
    public String toString() {
        String cadena = String.format("Informacion Sueldo\n"
                + "Nombre: %s\n"
                + "Aplellido: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n" ,obtenerNombre()
                , obtenerApellido(), obtenerCedula(), obtenerSueldoBasico()
                , obtenerSueldoTotal());
        return cadena;
    }
}
