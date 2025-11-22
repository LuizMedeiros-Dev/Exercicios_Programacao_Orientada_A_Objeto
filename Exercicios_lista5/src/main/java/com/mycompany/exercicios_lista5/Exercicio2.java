/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class Exercicio2 extends JFrame {
    private JTextField tfProduto, tfQuantidade, tfValor, tfData, tfTotal;
    private DefaultTableModel model;
    public Exercicio2(){
        setTitle("Vendas Loja");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(2,4,5,5));
        tfProduto=new JTextField(); tfQuantidade=new JTextField(); tfValor=new JTextField();
        tfData=new JTextField(LocalDate.now().toString()); tfTotal=new JTextField("0.00");
        tfTotal.setEditable(false);
        p.add(new JLabel("Produto")); p.add(tfProduto);
        p.add(new JLabel("Quantidade")); p.add(tfQuantidade);
        p.add(new JLabel("Valor (unit)")); p.add(tfValor);
        p.add(new JLabel("Data")); p.add(tfData);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Produto","Quantidade","Valor Unit","Subtotal","Data"},0);
        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
        JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnAdd = new JButton("Adicionar");
        south.add(new JLabel("Total:")); south.add(tfTotal); south.add(btnAdd);
        add(south, BorderLayout.SOUTH);
        btnAdd.addActionListener(e->{
            try{
                String prod = tfProduto.getText().trim();
                int q = Integer.parseInt(tfQuantidade.getText().trim());
                double v = Double.parseDouble(tfValor.getText().trim());
                String d = tfData.getText().trim();
                double sub = q * v;
                model.addRow(new Object[]{prod,q,String.format("%.2f",v),String.format("%.2f",sub),d});
                double total=0;
                for(int i=0;i<model.getRowCount();i++) total+=Double.parseDouble(model.getValueAt(i,3).toString());
                tfTotal.setText(String.format("%.2f", total));
            }catch(Exception ex){}
        });
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio2().setVisible(true)); }
}

