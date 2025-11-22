/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Exercicio9 extends JFrame {
    private DefaultTableModel modelC, modelP;
    private JTextField tfAnimalId, tfRaca, tfIdade, tfPastagem, tfQtdAnimais, tfAreaPastagem;
    public Exercicio9(){
        setTitle("Controle Gado e Pastos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,450);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(2,6,5,5));
        tfAnimalId=new JTextField(); tfRaca=new JTextField(); tfIdade=new JTextField();
        tfPastagem=new JTextField(); tfQtdAnimais=new JTextField(); tfAreaPastagem=new JTextField();
        p.add(new JLabel("ID Animal")); p.add(tfAnimalId);
        p.add(new JLabel("Raça")); p.add(tfRaca);
        p.add(new JLabel("Idade")); p.add(tfIdade);
        p.add(new JLabel("Pastagem")); p.add(tfPastagem);
        p.add(new JLabel("Qtd Animais (Pastagem)")); p.add(tfQtdAnimais);
        p.add(new JLabel("Área Pastagem (ha)")); p.add(tfAreaPastagem);
        JButton btnAddAnimal=new JButton("Adicionar Animal");
        JButton btnAddPastagem=new JButton("Cadastrar Pastagem");
        p.add(btnAddAnimal); p.add(btnAddPastagem);
        add(p, BorderLayout.NORTH);
        modelC = new DefaultTableModel(new String[]{"ID","Raça","Idade","Pastagem"},0);
        modelP = new DefaultTableModel(new String[]{"Pastagem","Qtd Animais","Área (ha)"},0);
        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(new JTable(modelC)), new JScrollPane(new JTable(modelP)));
        add(split, BorderLayout.CENTER);
        btnAddAnimal.addActionListener(e-> modelC.addRow(new Object[]{tfAnimalId.getText(), tfRaca.getText(), tfIdade.getText(), tfPastagem.getText()}));
        btnAddPastagem.addActionListener(e-> modelP.addRow(new Object[]{tfPastagem.getText(), tfQtdAnimais.getText(), tfAreaPastagem.getText()}));
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio9().setVisible(true)); }
}
