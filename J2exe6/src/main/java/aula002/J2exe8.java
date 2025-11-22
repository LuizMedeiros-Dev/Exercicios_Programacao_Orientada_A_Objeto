
package aula002;

import java.awt.*;
import java.awt.event.*;

public class J2exe8 extends Frame implements ActionListener{
    public Label l1;
    public Button b1, b2, b3;
    public TextField tx;
    public Dimension dim;
    
    public J2exe8(){
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(dim);
        setLocation(0,0);
        setTitle("A interface / Action Listener");
        setBackground(new Color(250,250,200));
        setLayout(null);
        
        l1 = new Label("Aperte o Botão");
        l1.setLocation(50,50);
        l1.setBackground(new Color(250,250,200));
        l1.setSize(150,20);
        
        b1 = new Button("Sair");
        b1.setSize(60,20);
        b1.setLocation(50,150);
        b1.setBackground(new Color(200,220,200));
        b1.addActionListener(this);
        
        b2 = new Button("Vermelho");
        b2.setSize(60,20);
        b2.setLocation(200,150);
        b2.setBackground(new Color(200,220,200));
        b2.addActionListener(this);
        
        b3 = new Button("Voltar");
        b3.setSize(60,20);
        b3.setLocation(200,200);
        b3.setBackground(new Color(200,220,200));
        b3.addActionListener(this);
        
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        
        addWindowListener(new FechaJanela());
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            System.exit(0);
        }
        
        if(e.getSource()==b2){
            setBackground(Color.red);
            l1.setBackground(Color.red);
        }
        
        if(e.getSource()==b3){
            setBackground(new Color(250,250,200));
            l1.setBackground(new Color(250,250,200));
        }
    }
    public static void main(String arg[]){
        new J2exe8().setVisible(true);
    }
    
}
        
