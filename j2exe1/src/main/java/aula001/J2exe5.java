
package aula001;

import java.awt.*;
import java.awt.event.*;

public class J2exe5 extends J2exe1{
    Dimension dim;
    Image im;
    Font letra;
    Label l1;
    
    public J2exe5(){
        Dimension dim = new Dimension(400,300);
        setTitle("Uso da Classe Font");
        setResizable(true);
        setSize(dim);
        setLocation(0,0);
        setBackground(Color.lightGray);
        
        letra = new Font("TimesRoman",Font.PLAIN,19);
        setFont(letra);
        setLayout(null);
        
        l1 = new Label("Manipulando as Fontes");
        l1.setLocation(190,120);
        l1.setSize(350,20);
        add(l1);
    }
    
    public static void main(String[] args){
        new J2exe5().setVisible(true);
    }
}
