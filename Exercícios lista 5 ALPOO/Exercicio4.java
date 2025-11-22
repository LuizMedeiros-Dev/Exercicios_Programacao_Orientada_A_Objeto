/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Exercicio4 extends JFrame {
    private JTextField tfCliente, tfServico, tfValor, tfData, tfProfissional, tfObs;
    private DefaultTableModel model;
    public Exercicio4(){
        setTitle("Vendas Salão de Beleza");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(3,4,5,5));
        tfCliente=new JTextField(); tfServico=new JTextField(); tfValor=new JTextField();
        tfData=new JTextField(); tfProfissional=new JTextField(); tfObs=new JTextField();
        p.add(new JLabel("Cliente")); p.add(tfCliente);
        p.add(new JLabel("Serviço")); p.add(tfServico);
        p.add(new JLabel("Valor")); p.add(tfValor);
        p.add(new JLabel("Data")); p.add(tfData);
        p.add(new JLabel("Profissional")); p.add(tfProfissional);
        p.add(new JLabel("Observações")); p.add(tfObs);
        JButton btnAdd=new JButton("Registrar");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Cliente","Serviço","Valor","Data","Profissional","Obs"},0);
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        btnAdd.addActionListener(e->{
            model.addRow(new Object[]{tfCliente.getText(), tfServico.getText(), tfValor.getText(), tfData.getText(), tfProfissional.getText(), tfObs.getText()});
        });
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio4().setVisible(true)); }
}
