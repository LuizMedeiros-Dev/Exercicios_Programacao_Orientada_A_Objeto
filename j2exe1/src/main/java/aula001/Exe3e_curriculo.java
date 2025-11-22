
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exe3e_curriculo extends J2exe1{
    Dimension dim;
    Button bSalvar, bLimpar;
    TextField txNome, txFone, txEmail, txCursos, txExperiencias;
    Label lNome, lFone, lEmail, lCursos, lExperiencias;
    Font fonte = new Font("Times New Roman",Font.PLAIN,19);
    
    public Exe3e_curriculo(){
        setTitle("Currículo");
        setResizable(false);
        setSize(400,350);
        setLocation(567,200);
        setBackground( Color.blue);
        setFont(fonte);
        setLayout(null);
        
        //Labels
        lNome = new Label("Nome ");
        lNome.setBounds(30,50,100,25);
        
        lFone = new Label("Telefone: ");
        lFone.setBounds(30,90,100,25);
        
        lEmail = new Label("E-mail: ");
        lEmail.setBounds(30, 130, 100, 25);
        
        lCursos = new Label("Cursos ");
        lCursos.setBounds(30,170,100,25);
        
        lExperiencias = new Label("Experiencias ");
        lExperiencias.setBounds(30,210,100,25);
        
        //TextFields
        txNome = new TextField();
        txNome.setBounds(140, 50, 200, 25);
        
        txFone = new TextField();
        txFone.setBounds(140, 90, 200, 25);
        
        txEmail = new TextField();
        txEmail.setBounds(140,130,200,25);
        
        txCursos = new TextField();
        txCursos.setBounds(140,170,200,25);
        
        txExperiencias = new TextField();
        txExperiencias.setBounds(140,210,200,25);
        
        //Botão Salvar
        bSalvar = new Button("Salvar");
        bSalvar.setBounds(70,270,120,30);
        bSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Currículo Salvo com Sucesso!");
                txNome.setText("");
                txFone.setText("");
                txEmail.setText("");
                txCursos.setText("");
                txExperiencias.setText(""); 
            }
        });
        
        
        //Botão Limpar
        bLimpar = new Button("Limpar");
        bLimpar.setBounds(210, 270, 120, 30);
        bLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txNome.setText("");
                txFone.setText("");
                txEmail.setText("");
                txCursos.setText("");
                txExperiencias.setText(""); 
            }
        });
        
        
        //Adicionando Objetos ao Frame
        add(txNome);
        add(txFone);
        add(txEmail);
        add(txCursos);
        add(txExperiencias);
        add(lNome);
        add(lFone);
        add(lEmail);
        add(lCursos);
        add(lExperiencias);
        add(bSalvar);
        add(bLimpar);
        
    }
    
    public static void main(String[] args){
        new Exe3e_curriculo().setVisible(true);
    }
    
    
    
}
