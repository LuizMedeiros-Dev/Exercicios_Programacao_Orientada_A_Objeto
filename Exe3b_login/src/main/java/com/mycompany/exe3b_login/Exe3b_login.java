
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exe3b_login extends J2exe1{
    Dimension dim;
    Button bSalvar, bLimpar;
    TextField txNome, txRA, txCurso, txPeriodo, txTurno;
    Label lNome, lRA, lCurso, lPeriodo, lTurno;
    Font fonte = new Font("Times New Roman",Font.PLAIN,19);
    
    public Exe3a(){
        setTitle("Cadastro Aluno Unip");
        setResizable(false);
        setSize(400,350);
        setLocation(567,200);
        setBackground(new Color(255,127,127));
        setFont(fonte);
        setLayout(null);
        
        //Labels
        lNome = new Label("Aluno: ");
        lNome.setBounds(30,50,100,25);
        
        lRA = new Label("RA: ");
        lRA.setBounds(30,90,100,25);
        
        lCurso = new Label("Curso: ");
        lCurso.setBounds(30, 130, 100, 25);
        
        lPeriodo = new Label("Período: ");
        lPeriodo.setBounds(30,170,100,25);
        
        lTurno = new Label("Turno: ");
        lTurno.setBounds(30,210,100,25);
        
        //TextFields
        txNome = new TextField();
        txNome.setBounds(140, 50, 200, 25);
        
        txRA = new TextField();
        txRA.setBounds(140, 90, 200, 25);
        
        txCurso = new TextField();
        txCurso.setBounds(140,130,200,25);
        
        txPeriodo = new TextField();
        txPeriodo.setBounds(140,170,200,25);
        
        txTurno = new TextField();
        txTurno.setBounds(140,210,200,25);
        
        //Botão Salvar
        bSalvar = new Button("Salvar");
        bSalvar.setBounds(70,270,120,30);
        bSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Seus Dados Foram Salvos!!");
                txNome.setText("");
                txRA.setText("");
                txCurso.setText("");
                txPeriodo.setText("");
                txTurno.setText(""); 
            }
        });
        
        
        //Botão Limpar
        bLimpar = new Button("Limpar");
        bLimpar.setBounds(210, 270, 120, 30);
        bLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txNome.setText("");
                txRA.setText("");
                txCurso.setText("");
                txPeriodo.setText("");
                txTurno.setText(""); 
            }
        });
        
        
        //Adicionando Objetos ao Frame
        add(txNome);
        add(txRA);
        add(txCurso);
        add(txPeriodo);
        add(txTurno);
        add(lNome);
        add(lRA);
        add(lCurso);
        add(lPeriodo);
        add(lTurno);
        add(bSalvar);
        add(bLimpar);
        
    }
    
    public static void main(String[] args){
        new Exe3a().setVisible(true);
    }
    
    
    
}
