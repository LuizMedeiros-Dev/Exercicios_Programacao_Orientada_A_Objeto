/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Exercicio6 extends JFrame {
    private DefaultTableModel model;
    private JTextField tfNome, tfSexo, tfIdade, tfCPF, tfNaturalidade, tfInscricao;
    private JCheckBox cbAprovado;
    public Exercicio6(){
        setTitle("Candidatos - Concurso");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(2,7,5,5));
        tfNome=new JTextField(); tfSexo=new JTextField(); tfIdade=new JTextField(); tfCPF=new JTextField();
        tfNaturalidade=new JTextField(); tfInscricao=new JTextField(); cbAprovado=new JCheckBox("Aprovado");
        p.add(new JLabel("Nome")); p.add(tfNome);
        p.add(new JLabel("Sexo")); p.add(tfSexo);
        p.add(new JLabel("Idade")); p.add(tfIdade);
        p.add(new JLabel("CPF")); p.add(tfCPF);
        p.add(new JLabel("Naturalidade")); p.add(tfNaturalidade);
        p.add(new JLabel("Inscrição")); p.add(tfInscricao);
        p.add(cbAprovado);
        JButton btnAdd=new JButton("Adicionar");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Nome","Sexo","Idade","CPF","Naturalidade","Inscrição","Aprovado"},0);
        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
        btnAdd.addActionListener(e-> model.addRow(new Object[]{tfNome.getText(), tfSexo.getText(), tfIdade.getText(), tfCPF.getText(), tfNaturalidade.getText(), tfInscricao.getText(), cbAprovado.isSelected() ? "S" : "N"}));
        JButton btnFilter=new JButton("Mostrar Aprovados");
        btnFilter.addActionListener(e->{
            DefaultTableModel m2 = new DefaultTableModel(new String[]{"Nome","Sexo","Idade","CPF","Naturalidade","Inscrição","Aprovado"},0);
            for(int i=0;i<model.getRowCount();i++){
                if("S".equals(model.getValueAt(i,6))) m2.addRow(new Object[]{
                        model.getValueAt(i,0),model.getValueAt(i,1),model.getValueAt(i,2),
                        model.getValueAt(i,3),model.getValueAt(i,4),model.getValueAt(i,5),model.getValueAt(i,6)
                });
            }
            JTable t = new JTable(m2);
            JOptionPane.showMessageDialog(this, new JScrollPane(t),"Aprovados",JOptionPane.PLAIN_MESSAGE);
        });
        add(btnFilter, BorderLayout.SOUTH);
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio6().setVisible(true)); }
}
