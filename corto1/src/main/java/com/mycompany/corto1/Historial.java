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
public class Historial {
    public static String historial[][]=new String[100][7];
    public static int registro=0;
    public void setHistorial(String detalle,String entrada,String salida,String producto,String existencia){
        LocalDateTime datetime = LocalDateTime.now();
        historial[registro][0]=""+0;
        historial[registro][1]=""+datetime;
        historial[registro][2]=detalle;
        historial[registro][3]=""+entrada;
        historial[registro][4]=""+salida;
        historial[registro][5]=existencia;
        historial[registro][6]=producto;
    }
    public String getCorrelativo(int pos){
        return historial[pos][0];
    }
    public String getFecha(int pos){
        return historial[pos][1];
    }
    public String getDetalle(int pos){
        return historial[pos][2];
    }
    public String getEntrada(int pos){
        return historial[pos][3];
    }
    public String getSalida(int pos){
        return historial[pos][4];
    }
    public String getExistencia(int pos){
        return historial[pos][5];
    }
    public String getProducto(int pos){
        return historial[pos][6];
    }
}
