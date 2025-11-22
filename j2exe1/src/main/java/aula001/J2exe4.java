
package aula001;

import java.awt.*;
import java.awt.event.*;

public class J2exe4 extends J2exe1{
    Dimension dim1, dim2, dim3;
    Button b1;
    TextField tx;
    Label l1;
    
    public J2exe4(){
        Dimension dim1 = new Dimension(400,300);
        Dimension dim2 = new Dimension(150,20);
        Dimension dim3 = new Dimension(60,20);
        setTitle("Uso da classe Dimension");
        setResizable(false);
        setSize(dim1);
        setLocation(100,100);
        setBackground(Color.lightGray);
        setLayout(null);
        
        l1 = new Label("Este é o programa visual.");
        l1.setLocation(50,50);
        l1.setSize(dim2);
        
        tx = new TextField("Escreva seu nome");
        tx.setLocation(50, 150);
        tx.setSize(dim2);
        
        b1 = new Button("Botão na Tela");
        b1.setLocation(50,150);
        b1.setSize(dim2);
        b1.setBackground(new Color(150,220,255));
        
        add(l1);
        add(b1);
        add(tx);
    }
    
    public static void main(String[] args){
        new J2exe4().setVisible(true);
    }
}
