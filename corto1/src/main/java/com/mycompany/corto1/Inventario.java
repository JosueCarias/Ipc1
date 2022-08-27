/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corto1;
import java.time.LocalDateTime;

/**
 *
 * @author josue
 */

public class Inventario {
    public static String inventario[][]=new String[100][5];
    public static int cantidad=0;
    public void serInvetario(String nombre){
        LocalDateTime datetime = LocalDateTime.now();
        inventario[cantidad][0]=""+0;
        inventario[cantidad][1]=nombre;
        inventario[cantidad][2]=""+datetime;
        inventario[cantidad][3]=""+0;
        inventario[cantidad][4]="";
    }
    public String getCorrelativo(int pos){
        return inventario[pos][0];
    }
    public String getProducto(int pos){
        return inventario[pos][1];
    }
    public String getFecha(int pos){
        return inventario[pos][2];
    }
    public String getCantidad(int pos){
        return inventario[pos][3];
    }
    public String getDetalle(int pos){
        return inventario[pos][4];
    }
    public void setNuevaCantidad(int pos, int cantidad){
        inventario[pos][3]=""+(cantidad+(Integer.parseInt(inventario[pos][3])));
    }
    public void setNuevoDetalle(int pos, String detalle){
        inventario[pos][4]=detalle;
    }
    public void setNuevaFecha(int pos){
        LocalDateTime datetime = LocalDateTime.now();
        inventario[pos][2]=""+datetime;
    }
}
