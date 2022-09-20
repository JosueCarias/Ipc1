/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;
//importacion de la libreria necesarias para generar la manzana
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author josue
 */
public class PanelFondo extends JPanel{
    //Configuracion del color de la serpiente
    Color colorFondo=Color.gray;
    //creaccion de las variables necesarias
    int tamMax, tam,can,res;
    //construcctor de la clase panel fondo
    public PanelFondo(int tamMax,int can){
        this.tamMax=tamMax;
        this.can=can;
        this.tam=tamMax/can;
    }
    //proceso para generar la cuadricula
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorFondo);
        for(int i=0;i<can;i++){
            for(int j=0;j<can;j++){
                pintor.fillRect(i*tam,j*tam,tam-1,tam-1);
            }
        }
    }
}
