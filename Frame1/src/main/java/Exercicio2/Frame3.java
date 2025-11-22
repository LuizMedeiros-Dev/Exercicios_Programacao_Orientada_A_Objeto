/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.awt.*;
import java.awt.event.*;

public class Frame3 extends Frame1 {
    public Frame3(){
        setTitle("Freme 3, o mais lindão!");
        setSize(500,500);
        setResizable(true);
        Color corTop = new Color(224,17,95);
        setBackground(corTop);
    }
    
    public static void main(String[] args){
        new Frame3().setVisible(true);
    }
    
}
