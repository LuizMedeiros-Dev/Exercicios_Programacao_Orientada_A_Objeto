
package aula002;

import java.awt.*;
import java.awt.event.*;

public class Exerc1b_amarelo extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    Label l1;
    Dimension dim;
    
    public Exerc1b_amarelo(){
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Exercício 1 a)");
        setResizable(false);
        setSize(dim);
        setLocation(0,0);
        setBackground(new Color(200,200,200));
        setLayout(null);
        
        l1 = new Label("Aperte um dos botões:");
        l1.setLocation(50,50);
        l1.setBackground(new Color(200,200,200));
        l1.setSize(150,20);
        
        b1 = new Button("Sair");
        b1.setSize(60,20);
        b1.setLocation(50,150);
        b1.addActionListener(this);
        
        b2 = new Button("Amarelo");
        b2.setSize(60,20);
        b2.setLocation(200,150);
        b2.setBackground(Color.YELLOW);
        b2.addActionListener(this);
        
        b3 = new Button("Outra Cor");
        b3.setSize(60,20);
        b3.setLocation(200,200);
        b3.setBackground(new Color(110,200,80));
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
            setBackground(Color.YELLOW);
            l1.setBackground(Color.YELLOW);
        }
        
        if(e.getSource()==b3){
            setBackground(new Color(110,200,80));
            l1.setBackground(new Color(110,200,80));
        }
        
        if(e.getSource()==b4){
            setBackground(new Color(200,200,200));
            l1.setBackground(new Color (200,200,200));
        }
    }
    
    public static void main(String arg[]){
        new Exerc1b_amarelo().setVisible(true);
    }
}
