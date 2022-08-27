/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;
import static com.mycompany.proyecto1.frmMenu.contador;
import static com.mycompany.proyecto1.frmMenu.clientes;


/**
 *
 * @author josue
 */
public class Clientes {
    //funcion para setetar de la clase clientes
    public void setClientes(String cui, String nombre, String apellido, String cuenta){  
        clientes[contador][0]=cui;
        clientes[contador][1]=nombre;
        clientes[contador][2]=apellido;
    }
    // funcion para obtener el cui de la clase clientes
    public String getCui(int pos){
        return clientes[pos][0];
    }
    // funcion para obtener el nombre de la clase clientes
    public String getNombre(int pos){
        return clientes[pos][1];
    }
    // funcion para obtener el apellido de la clase clientes
    public String getApellido(int pos){
        return clientes[pos][2];
    }
}
