
package aula002;

import java.awt.*;
import java.awt.event.*;

public class Exerc1a_azul extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    Label l1;
    Dimension dim;
    
    public Exerc1a_azul(){
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Exercício 1 a)");
        setResizable(false);
        setSize(dim);
        setLocation(0,0);
        setBackground(new Color(200,200,200));
        setLayout(null);
        
        l1 = new Label("Aperte um dos botões:");
        l1.setLocation(50,50);
        l1.setSize(150,20);
        
        b1 = new Button("Sair");
        b1.setSize(60,20);
        b1.setLocation(50,150);
        b1.addActionListener(this);
        
        b2 = new Button("Azul");
        b2.setSize(60,20);
        b2.setLocation(200,150);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        
        b3 = new Button("Outra Cor");
        b3.setSize(60,20);
        b3.setLocation(200,200);
        b3.setBackground(new Color(170,170,170));
        b3.addActionListener(this);
        
        b4 = new Button("Voltar");
        b4.setSize(60,20);
        b4.setLocation(200,250);
        b4.setBackground(new Color(200,220,200));
        b4.addActionListener(this);
        
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        
        addWindowListener(new FechaJanela());
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            System.exit(0);
        }
        
        if(e.getSource()==b2){
            setBackground(Color.BLUE);
        }
        
        if(e.getSource()==b3){
            setBackground(new Color(170,170,170));
        }
        
        if(e.getSource()==b4){
            setBackground(new Color(200,200,200));
        }
    }
    
    public static void main(String arg[]){
        new Exerc1a_azul().setVisible(true);
    }
}