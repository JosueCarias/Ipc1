/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;
import static com.mycompany.proyecto1.frmMenu.cuentas;
import static com.mycompany.proyecto1.frmMenu.contador;
import static com.mycompany.proyecto1.frmMenu.clientes;
import static com.mycompany.proyecto1.frmMenu.correlativo;

/**
 *
 * @author josue
 */
public class Cuentas {
    //funcion para setetar de la clase cuentas
    public void setCuentas(int pos){
        Clientes clientes=new Clientes();
        cuentas[correlativo][0]=""+(correlativo);
        cuentas[correlativo][1]=clientes.getNombre(pos);
        cuentas[correlativo][2]=""+0;
        cuentas[correlativo][3]=clientes.getCui(pos);
    }
    // funcion para obtener el numero de la clase cuentas
    public String getCuenta(int pos){
        return cuentas[pos][0];
    }
    // funcion para obtener el nombre de la clase cuentas
    public String getNombre(int pos){
        return cuentas[pos][1];
    }
    // funcion para obtener el saldo de la clase cuentas
    public String getSaldo(int pos){
        return cuentas[pos][2];
    }
    // funcion para obtener el cui de la clase cuentas
    public String getCui(int pos){
        return cuentas[pos][3];
    }
    // funcion para actualiza la cantidad de dinero
    public void setdinero(int pos, float dinero){
        cuentas[pos][2]=""+(dinero+(Float.parseFloat(cuentas[pos][2])));
    }
}
