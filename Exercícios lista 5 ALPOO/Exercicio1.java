/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_lista5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Exercicio1 extends JFrame {
    private JTextField tfDestino, tfNome, tfCPF, tfRG, tfIdade, tfPoltrona;
    private JButton btnVender;
    private DefaultListModel<String> model = new DefaultListModel<>();
    private boolean[] poltronas = new boolean[22];
    public Exercicio1(){
        setTitle("Cadastro Passageiros - Ônibus 22 poltronas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(7,2));
        tfDestino=new JTextField(); tfNome=new JTextField(); tfCPF=new JTextField();
        tfRG=new JTextField(); tfIdade=new JTextField(); tfPoltrona=new JTextField();
        p.add(new JLabel("Destino")); p.add(tfDestino);
        p.add(new JLabel("Nome")); p.add(tfNome);
        p.add(new JLabel("CPF")); p.add(tfCPF);
        p.add(new JLabel("RG")); p.add(tfRG);
        p.add(new JLabel("Idade")); p.add(tfIdade);
        p.add(new JLabel("Poltrona (1-22)")); p.add(tfPoltrona);
        btnVender=new JButton("Vender");
        p.add(btnVender);
        add(p, BorderLayout.NORTH);
        JList<String> list = new JList<>(model);
        add(new JScrollPane(list), BorderLayout.CENTER);
        btnVender.addActionListener(e->{
            try{
                int pol = Integer.parseInt(tfPoltrona.getText().trim())-1;
                if(pol<0||pol>=22){ JOptionPane.showMessageDialog(this,"Poltrona inválida"); return;}
                if(poltronas[pol]){ JOptionPane.showMessageDialog(this,"Poltrona ocupada"); return;}
                poltronas[pol]=true;
                model.addElement((pol+1)+" - "+tfNome.getText().trim()+" - "+tfDestino.getText().trim());
                if(isFull()) JOptionPane.showMessageDialog(this,"Todas as passagens vendidas");
            }catch(Exception ex){ JOptionPane.showMessageDialog(this,"Erro nos dados");}
        });
    }
    private boolean isFull(){
        for(boolean b:poltronas) if(!b) return false;
        return true;
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio1().setVisible(true)); }
}
