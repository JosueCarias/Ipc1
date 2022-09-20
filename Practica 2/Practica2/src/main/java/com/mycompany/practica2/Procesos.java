/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import static com.mycompany.practica2.Manzana.posXManzana;
import static com.mycompany.practica2.Manzana.posYManzana;
import static com.mycompany.practica2.Serpiente.estado;
import static com.mycompany.practica2.Serpiente.pasosX;
import static com.mycompany.practica2.Serpiente.pasosY;
import static com.mycompany.practica2.Snake.posXSnake;
import static com.mycompany.practica2.Snake.posYSnake;
import java.util.Random;


/**
 *
 * @author josue
 */
public class Procesos extends Thread{
    //creacion de las instacia para generar numeros random y paneles
    Random random=new Random();
    Paneles paneles=new Paneles();
    //creacion de variable 
    public static int punteo=1;
    public static int velocidad=1000;
    
    @Override
    public void run(){
        comer();
        perder();
    }
    //proceso de comer manzana
    public void comer(){
        if(posXSnake==posXManzana&posYSnake==posYManzana){
            punteo++;
            posXManzana=random.nextInt(10);
            posYManzana=random.nextInt(10);          
        }
        if(punteo>=25){
            paneles.show("Has ganado");
        }
    }
    //proceso para perder
    public void perder(){
        if(posXSnake==-1||posXSnake==10||posYSnake==-1||posYSnake==10){
            paneles.show("Has chocado con un muro");
        }
    }
    //acutaliza la posicion en x
    public void setPosX(){
        posXSnake=posXSnake+pasosX;
        velocidad();
    }
    //acutaliza la posicion en y
    public void setPosY(){
        posYSnake=posYSnake+pasosY;
        velocidad();
    }
    //acutaliza el tiempo de espera entre movimiento
    public void velocidad(){
        if(estado==0 & velocidad>100){
            velocidad=(int) (velocidad*(1-0.06));
            try {               
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                System.out.print(ex);
            }
        }
        else if(estado==1 & velocidad>100){
            velocidad=(int) (velocidad*(1-0.06));
            try {               
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                System.out.print(ex);
            }
        }
        else if(estado==2 & velocidad>100){
            velocidad=(int) (velocidad*(1-0.09));
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                System.out.print(ex);
                
            }
        }
        else if(velocidad<=100){
            velocidad=100;
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                System.out.print(ex);
                
            }
        }
    }
}
