/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import static com.mycompany.practica2.Procesos.punteo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author josue
 */
public class Snake extends JPanel {
    //configuracion del colo de la serpiente
    Color colorSnake=Color.green;
    //creacion de variables
    int tamMax, tam,can,res;
    public static int posXSnake=4;
    public static int posYSnake=4;
    public static int[][] cuerpo=new int[2000][2];
    public static int largo=0;
    public static boolean[][] pintar=new boolean[10][10];
    //constructor de la clase
    public Snake(int tamMax,int can){
        this.tamMax=tamMax;
        this.can=can;
        this.tam=tamMax/can;      
        
    }
    //proceso para pintar a la serpiente 
    @Override
    public void paint(Graphics pintor){      
        super.paint(pintor);
        pintor.setColor(colorSnake);
        pintor.fillRect(posXSnake*40,posYSnake*40,tam-1,tam-1);
        cuerpo[largo][0]=posXSnake;
        cuerpo[largo][1]=posYSnake;
        for(int i=0;i<largo;i++){
            pintar[cuerpo[i][0]][cuerpo[i][1]]=false;
        }  
        for(int i=(largo-punteo+1);i<largo;i++){
            pintar[cuerpo[i][0]][cuerpo[i][1]]=true;       
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(pintar[i][j]==true){
                    pintor.fillRect(i*40,j*40,tam-2,tam-2);
                }
            }
        }   
    }   
}
    
