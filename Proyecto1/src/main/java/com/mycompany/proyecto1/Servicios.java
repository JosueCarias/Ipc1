/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import static com.mycompany.proyecto1.frmMenu.servicios;

/**
 *
 * @author josue
 */
public class Servicios {
    //funcion para setetar de la clase servicios
    public void setServicios(){
        servicios[0][0]="Luz electrica";
        servicios[0][1]="";
        servicios[1][0]="Agua";
        servicios[1][1]="";
        servicios[2][0]="Servicio de telefono";
        servicios[2][1]="";
        
    }
    // funcion para obtener el tipo de servicio de la clase servicios
    public static String getServicios(int pos){
        return servicios[pos][0];
    }
    // funcion para obtener el monto de servicio de la clase servicios
    public static String getMonto(int pos){
        return servicios[pos][1];
    }
    // funcion para actualizar el dinero del servicio de la clase servicios
    public void setNuevoMonto(int pos, float dinero){
        servicios[pos][1]=servicios[pos][1]+dinero;
    }
}
