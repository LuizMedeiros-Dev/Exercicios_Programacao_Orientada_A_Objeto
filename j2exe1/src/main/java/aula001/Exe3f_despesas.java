
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exe3f_despesas extends J2exe1{
    Dimension dim;
    Button bCalcular;
    TextField txI1,txI2,txI3,txI4,txI5, txV1, txV2, txV3, txV4, txV5;
    Label lItens, lValor;
    Font fonte = new Font("Times New Roman",Font.PLAIN,19);
    
    public Exe3f_despesas(){
        setTitle("Finanças Diárias:");
        setResizable(false);
        setSize(400,350);
        setLocation(567,200);
        setBackground( Color.green);
        setFont(fonte);
        setLayout(null);
        
        //Labels
        lItens = new Label("Item: ");
        lItens.setBounds(40,50,100,25);
        
        lValor = new Label("Valor Total: ");
        lValor.setBounds(250, 50, 200, 25);
        
        txI1 = new TextField();
        txI1.setBounds(40, 90, 200, 25);
        
        txI2 = new TextField();
        txI2.setBounds(40, 130, 200, 25);
        
        txI3 = new TextField();
        txI3.setBounds(40, 170, 200, 25);
        
        txI4 = new TextField();
        txI4.setBounds(40, 210, 200, 25);
        
        txI5 = new TextField();
        txI5.setBounds(40, 250, 200, 25);
        
        txV1 = new TextField();
        txV1.setBounds(250, 90, 100, 25);
        
        txV2 = new TextField();
        txV2.setBounds(250, 130, 100, 25);
        
        txV3 = new TextField();
        txV3.setBounds(250, 170, 100, 25);
        
        txV4 = new TextField();
        txV4.setBounds(250, 210, 100, 25);
        
        txV5 = new TextField();
        txV5.setBounds(250, 250, 100, 25);
      
        //Botão Salvar
        bCalcular = new Button("Calcular");
        bCalcular.setBounds(90,290,120,30);
        bCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Tá precisando gastar menos, HEM!!");
                txV1.setText("");
                txV2.setText("");
                txV3.setText("");
                txV4.setText("");
                txV5.setText("");
                txI1.setText("");
                txI2.setText("");
                txI3.setText("");
                txI4.setText("");
                txI5.setText("");
                
            }
        });
        
        //Adicionando Objetos ao Frame
        add(lItens);
        add(lValor);
        add(txI1);
        add(txI2);
        add(txI3);
        add(txI4);
        add(txI5);
        add(txV1);
        add(txV2);
        add(txV3);
        add(txV4);
        add(txV5);
        
        add(bCalcular);
        //add(bLimpar);
        
    }
    
    public static void main(String[] args){
        new Exe3f_despesas().setVisible(true);
    }
    
    
    
}
