/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;

/**
 *
 * @author luizf
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;

public class Exercicio8 extends JFrame {
    private DefaultTableModel model;
    private JTextField tfResponsavel, tfCrianca, tfIdade, tfQtdIrmaos, tfEndereco;
    private static HashSet<Integer> ids = new HashSet<>();
    private static Random rnd = new Random();
    public Exercicio8(){
        setTitle("Doação Computadores - ONG");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(2,5,5,5));
        tfResponsavel=new JTextField(); tfCrianca=new JTextField(); tfIdade=new JTextField(); tfQtdIrmaos=new JTextField(); tfEndereco=new JTextField();
        p.add(new JLabel("Responsável")); p.add(tfResponsavel);
        p.add(new JLabel("Nome Criança")); p.add(tfCrianca);
        p.add(new JLabel("Idade")); p.add(tfIdade);
        p.add(new JLabel("Qtd Irmãos")); p.add(tfQtdIrmaos);
        p.add(new JLabel("Endereço")); p.add(tfEndereco);
        JButton btnAdd=new JButton("Registrar Doação");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"ID","Responsável","Criança","Idade","Irmãos","Endereço","Data"},0);
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        btnAdd.addActionListener(e->{
            int id = gerarID();
            model.addRow(new Object[]{id, tfResponsavel.getText(), tfCrianca.getText(), tfIdade.getText(), tfQtdIrmaos.getText(), tfEndereco.getText(), LocalDate.now().toString()});
        });
    }
    private int gerarID(){
        int x;
        do{x = rnd.nextInt(900000)+100000;}while(ids.contains(x));
        ids.add(x);
        return x;
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio8().setVisible(true)); }
}
