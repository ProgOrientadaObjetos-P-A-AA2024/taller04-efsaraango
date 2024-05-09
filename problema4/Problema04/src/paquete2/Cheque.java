/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import javax.swing.BoundedRangeModel;

/**
 *
 * @author Det-Pc
 */
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque(String n, String nban, double v) {
        nombreCliente = n;
        nombreBanco = nban;
        valorCheque = v;
    }
    public Cheque(String n, double v) {
        nombreCliente = n;
        nombreBanco = "Loja";
        valorCheque = v;
    }

    public void establecerNombreCliente(String s) {
        nombreCliente = s;
    }

    public void establecerNombreBanco(String s) {
        nombreBanco = s;
    }

    public void establecerValorCheque(double v) {
        valorCheque = v;
    }

    public void comisionBanco() {
        comisionBanco = valorCheque * 0.003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override

    public String toString() {
        String cadena = String.format("Informacion Cheque\n\n"
                + "Nombre Cliente: %s\n"
                + "Nombre Banco: %s\n"
                + "Valor Cheque: %.2f\n"
                + "Comisión del Banco: %.2f\n" , obtenerNombreCliente()
                , obtenerNombreBanco(), obtenerValorCheque(), obtenerComisionBanco());
        return cadena;
    }
}
