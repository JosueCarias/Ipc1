/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import static com.mycompany.proyecto1.frmMenu.historial;
import static com.mycompany.proyecto1.frmMenu.largo;
import static com.mycompany.proyecto1.frmMenu.cuentas;
import java.time.LocalDate;

/**
 *
 * @author josue
 */
public class Historial {
    //funcion para setetar de la clase historial
    public void setHistorial(int id,String detalle,String debito,String credito,String no,String saldo){
        Clientes clientes=new Clientes();
        Cuentas cuentas=new Cuentas();
        LocalDate todaysDate = LocalDate.now();
        historial[largo][0]=""+largo;
        historial[largo][1]=""+todaysDate;
        historial[largo][2]=detalle;
        historial[largo][3]=debito;
        historial[largo][4]=credito;
        historial[largo][5]=saldo;
        historial[largo][6]=no;
    }
    // funcion para obtener el cui de la clase historial
    public String getCui(int pos){
        return historial[pos][6];
    }
    // funcion para obtener el numero de accion de la clase historial
    public String getId(int pos){
        return historial[pos][0];
    }
    // funcion para obtener la fecha de la clase historial
    public String getFecha(int pos){
        return historial[pos][1];
    }
    // funcion para obtener el tipo de accion de la clase historial
    public String getDetalle(int pos){
        return historial[pos][2];
    }
    // funcion para obtener el monto a debitar de la clase historial
    public String getDebito(int pos){
        return historial[pos][3];
    }
    // funcion para obtener el monto a acreditar de la clase historial
    public String getCredito(int pos){
        return historial[pos][4];
    }
    // funcion para obtener el saldo de la clase historial
    public String getSaldo(int pos){
        return historial[pos][5];
    }
    // funcion para obtener el numero de cuenta de la clase historial
    public String getCuenta(int pos){
        return historial[pos][6];
    }
}
