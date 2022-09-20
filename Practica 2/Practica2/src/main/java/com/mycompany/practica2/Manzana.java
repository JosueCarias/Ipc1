/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;
//importacion de la libreria necesarias para generar la manzana
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author josue
 */
public class Manzana extends JPanel{
    //Configuracion del color de la manzana
    Color colorManzana=Color.red;
    //crea la instacia para generar numeros ramdom
    Random random=new Random();
    //creaccion de las variables necesarias
    int tamMax, tam,can,res;
    public static int posXManzana=0;
    public static int posYManzana=0;
    //construcctor de la clase manzana
    public Manzana(int tamMax,int can){
        this.tamMax=tamMax;
        this.can=can;
        this.tam=tamMax/can;
        posXManzana=random.nextInt(10);
        posYManzana=random.nextInt(10);
    }
    //proceso para pintar la manzana en la cuadricula
    @Override
    public void paint(Graphics pintor){      
        super.paint(pintor);
        pintor.setColor(colorManzana);
        pintor.fillRect(posXManzana*40,posYManzana*40,tam-1,tam-1);
        
    }
}
