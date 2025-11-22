/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex_Canil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Canil extends WindowAdapter implements ActionListener{
    public Canil(){
    }
    
    public static void main(String args[]){
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        Cachorro c3 = new Cachorro();
        Cachorro c4 = new Cachorro();
        Cachorro c5 = new Cachorro();
        
        c1.raca = "Labrador";
        c1.cor = "Branco";
        c1.tamanho = "Medio";
        c1.nome = "Marley";
        
        c2.raca = "Golden";
        c2.cor = "Dourado";
        c2.tamanho = "Medio";
        c2.nome = "Fred";
        
        c3.raca = "PitBull";
        c3.cor = "Marron";
        c3.tamanho = "Médio";
        c3.nome = "Jade";
        
        c4.raca = "Lulu";
        c4.cor = "Preto";
        c4.tamanho = "Pequeno";
        c4.nome = "Teo";
        
        c5.raca = "Fila";
        c5.cor = "Preto c branco";
        c5.tamanho = "Grande";
        c5.nome = "Thor";
        
        
        c1.latir();
        c3.latir();
        c5.latir();
        
                
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
