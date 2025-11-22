/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_Canil;

import javax.swing.JOptionPane;


public class Cachorro {
    String raca, cor, nome, tamanho;
    boolean latir = false;
    
    public void latir(){
        latir = true;
        JOptionPane.showMessageDialog(null,nome+": AUAU!");
    }
    
    
}
