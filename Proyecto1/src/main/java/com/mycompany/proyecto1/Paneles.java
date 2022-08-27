/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Paneles {
    // clase para hacer los avisos en forma de paneles
    public static JOptionPane msg= new JOptionPane();
    public static void show(String txt){
        msg.showMessageDialog(null, txt);
    }
}
