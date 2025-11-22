/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exe3b_login extends J2exe1{
    Dimension dim = new Dimension(400,350);
    Button bSalvar, bLimpar;
    TextField txNome, txEmail, txFone, txCPF, txEndereco;
    Label lNome, lEmail, lFone, lCPF, lEndereco;
    Font fonte = new Font("Times New Roman",Font.PLAIN,19);
    
    public Exe3b_login(){
        setTitle("Tela de Login");
        setResizable(false);
        setSize(dim);
        setLocation(567,200);
        setBackground(new Color(137,207,240));
        setFont(fonte);
        setLayout(null);
        
        //Labels
        lNome = new Label("Nome: ");
        lNome.setBounds(30,50,100,25);
        
        lEmail = new Label("E-mail: ");
        lEmail.setBounds(30,90,100,25);
        
        lFone = new Label("Fone: ");
        lFone.setBounds(30, 130, 100, 25);
        
        lCPF = new Label("CPF: ");
        lCPF.setBounds(30,170,100,25);
        
        lEndereco = new Label("Endereço: ");
        lEndereco.setBounds(30,210,100,25);
        
        //TextFields
        txNome = new TextField();
        txNome.setBounds(140, 50, 200, 25);
        
        txEmail = new TextField();
        txEmail.setBounds(140, 90, 200, 25);
        
        txFone = new TextField();
        txFone.setBounds(140,130,200,25);
        
        txCPF = new TextField();
        txCPF.setBounds(140,170,200,25);
        
        txEndereco = new TextField();
        txEndereco.setBounds(140,210,200,25);
        
        //Botão Salvar
        bSalvar = new Button("Salvar");
        bSalvar.setBounds(70,270,120,30);
        bSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Seus Dados Foram Salvos!!");
                txNome.setText("");
                txEmail.setText("");
                txFone.setText("");
                txCPF.setText("");
                txEndereco.setText(""); 
            }
        });
        
        
        //Botão Limpar
        bLimpar = new Button("Limpar");
        bLimpar.setBounds(210, 270, 120, 30);
        bLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txNome.setText("");
                txEmail.setText("");
                txFone.setText("");
                txCPF.setText("");
                txEndereco.setText(""); 
            }
        });
        
        
        //Adicionando Objetos ao Frame
        add(txNome);
        add(txEmail);
        add(txFone);
        add(txEndereco);
        add(txCPF);
        add(lNome);
        add(lEmail);
        add(lFone);
        add(lEndereco);
        add(lCPF);
        add(bSalvar);
        add(bLimpar);
        
    }
    
    public static void main(String[] args){
        new Exe3b_login().setVisible(true);
    }
    
    
    
}
