/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exe3d_carro extends J2exe1{
    Dimension dim = new Dimension(390,400);
    Button bSalvar, bLimpar;
    TextArea txItens;
    Label lItens;
    Font fonte = new Font("Times New Roman",Font.PLAIN,19);
    
    public Exe3d_carro(){
        setTitle("Itens Carro dos Sonhos");
        setResizable(false);
        setSize(dim);
        setLocation(567,200);
        setBackground(new Color(207,14,14));
        setFont(fonte);
        setLayout(null);
        
        //Labels
        lItens = new Label("Itens do Seu Carro dos Sonhos: ");
        lItens.setBounds(30,50,400,100);
        
        //TextFields
        txItens = new TextArea();
        txItens.setBounds(30, 150, 280, 150);
        
        //Botão Salvar
        bSalvar = new Button("Salvar");
        bSalvar.setBounds(35,350,120,30);
        bSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Seus Itens Foram Salvos!!");
                txItens.setText("");
             
            }
        });
        
        
        //Botão Limpar
        bLimpar = new Button("Limpar");
        bLimpar.setBounds(190, 350, 120, 30);
        bLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txItens.setText("");
            }
        });
        
        
        //Adicionando Objetos ao Frame
        add(lItens);
        add(txItens);        
        add(bSalvar);
        add(bLimpar);
        
    }
    
    public static void main(String[] args){
        new Exe3d_carro().setVisible(true);
    }
    
    
    
}

