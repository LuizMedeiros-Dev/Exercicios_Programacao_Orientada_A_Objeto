package aula002;

import java.awt.*;
import java.awt.event.*;

public class J2exe9 extends Frame implements ActionListener{
    public Label L1 ;
    public Button B1, B2, B3, B4, B5,B6, B7, B8;
    public TextField Tx1, Tx2 ;
    public Dimension dim;
    
    public J2exe9(){
        dim = new Dimension(450,260);
        setSize(dim);
        setLocation(220,180);
        setTitle ("A classe FlowLayout");
        setBackground(new Color(250,250,200));
        
        //setLayout(new FlowLayout(FlowLayout.LEFT)); // alinhamento a esquerda 
        //setLayout(new FlowLayout(FlowLayout.CENTER)); 
       // setLayout(new FlowLayout(FlowLayout.RIGHT));  
         //setLayout(new FlowLayout(1, 15, 15));    
         setLayout(new FlowLayout(0,30,50));  
            
        L1 = new Label ("Esta é a classe \"FlowLayout\" :");
        L1.setBackground(new Color(250,250,200));
        
        Tx1 = new TextField(" ");
        Tx2 = new TextField("Escreva outra mensagem aqui ");

        B1 = new Button("Botao 01");
        B1.setBackground(new Color(250,250,200));
        B1.addActionListener(this);
            
        B2 = new Button("Botão 02");
        B2.setBackground(new Color(250,250,200));
        B2.addActionListener(this);;
        
        B3 = new Button("Botao 03");
        B3.setBackground(new Color(250,250,200));
        B3.addActionListener(this);;
        
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
        add(Tx1);
        add(Tx2);
        add(B1);
        add(B2);
        add(B3);
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
        new J2exe9().setVisible(true);
    }
} 
