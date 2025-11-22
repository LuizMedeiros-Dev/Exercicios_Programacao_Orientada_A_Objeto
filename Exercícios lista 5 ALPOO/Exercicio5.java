/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Exercicio5 extends JFrame {
    private JTextField tfNomePet, tfTipo, tfIdadePet, tfNomeDono, tfTelefone, tfEndereco;
    private DefaultTableModel model;
    public Exercicio5(){
        setTitle("Cadastro Pet Shop");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(3,4,5,5));
        tfNomePet=new JTextField(); tfTipo=new JTextField(); tfIdadePet=new JTextField();
        tfNomeDono=new JTextField(); tfTelefone=new JTextField(); tfEndereco=new JTextField();
        p.add(new JLabel("Nome Pet")); p.add(tfNomePet);
        p.add(new JLabel("Tipo")); p.add(tfTipo);
        p.add(new JLabel("Idade Pet")); p.add(tfIdadePet);
        p.add(new JLabel("Nome Dono")); p.add(tfNomeDono);
        p.add(new JLabel("Telefone")); p.add(tfTelefone);
        p.add(new JLabel("Endereço")); p.add(tfEndereco);
        JButton btnAdd=new JButton("Salvar");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Nome Pet","Tipo","Idade","Nome Dono","Telefone","Endereço"},0);
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        btnAdd.addActionListener(e-> model.addRow(new Object[]{tfNomePet.getText(), tfTipo.getText(), tfIdadePet.getText(), tfNomeDono.getText(), tfTelefone.getText(), tfEndereco.getText()}));
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio5().setVisible(true)); }
}

