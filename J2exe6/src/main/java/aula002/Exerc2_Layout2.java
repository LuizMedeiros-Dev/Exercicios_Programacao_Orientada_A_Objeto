package aula002;

import java.awt.*;
import java.awt.event.*;

public class Exerc2_Layout2 extends Frame implements ActionListener{
    public Label L1 ;
    public Button B4, B5,B6, B7, B8;
    public TextField Tx2 ;
    public Dimension dim;
    
    public Exerc2_Layout2(){
        dim = new Dimension(450,260);
        setSize(dim);
        setLocation(220,180);
        setTitle ("Layout 2");
        setBackground(new Color(250,250,200));
        setLayout(new FlowLayout(2,19,85));  
            
        L1 = new Label ("Deixe sua tela no estilo!");
        L1.setBackground(new Color(250,250,200));
        
        
        
        Tx2 = new TextField("Coloque uma das cores: ");
        
       
        B4 = new Button("Azul");
        B4.setBackground(new Color(0,0,200));
        B4.addActionListener(this);;

        B5 = new Button("Vermelho");
        B5.setBackground(new Color(200,0,0));       
        B5.addActionListener(this);;
        
        B6 = new Button("Verde");
        B6.setBackground(new Color(0,200,0));
        B6.addActionListener(this);;
        
        B7 = new Button("Amarelo");
        B7.setBackground(new Color(200,200,0));
        B7.addActionListener(this);;
        
        B8 = new Button("Sair");
        B8.setBackground(new Color(250,250,200));   
        B8.addActionListener(this);;
        
        add(L1);
        add(Tx2);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        addWindowListener(new FechaJanela());
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==B4){
            setBackground ( Color.blue ) ;
            L1.setBackground(Color.blue);
        }
        if (e.getSource()==B5){
            setBackground ( Color.red ) ;
            L1.setBackground(Color.red);
        }
        if (e.getSource()==B6){
            setBackground ( Color.green ) ;
            L1.setBackground(Color.green);
        }
        if (e.getSource()==B7){
            setBackground ( Color.yellow ) ;
            L1.setBackground(Color.yellow);
        }
        if (e.getSource()==B8)
            System.exit(0);
    }

    public static void main(String arg[]){
        //new j2exe9().show();
        new Exerc2_Layout2().setVisible(true);
    }
} 
