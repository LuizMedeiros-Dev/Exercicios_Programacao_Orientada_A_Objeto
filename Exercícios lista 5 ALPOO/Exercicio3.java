/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Exercicio3 extends JFrame {
    private DefaultTableModel model;
    private JTextField tfNome, tfRA, tfTurma;
    private JComboBox<String> cbFalta;
    public Exercicio3(){
        setTitle("Chamada Alunos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,350);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(1,7));
        tfNome=new JTextField(); tfRA=new JTextField(); tfTurma=new JTextField();
        cbFalta=new JComboBox<>(new String[]{"Presente","Falta"});
        p.add(new JLabel("Nome")); p.add(tfNome); p.add(new JLabel("RA")); p.add(tfRA);
        p.add(new JLabel("Turma")); p.add(tfTurma); p.add(cbFalta);
        JButton btnAdd = new JButton("Adicionar");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Nome","RA","Turma","Status"},0);
        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
        btnAdd.addActionListener(e->{
            model.addRow(new Object[]{tfNome.getText().trim(), tfRA.getText().trim(), tfTurma.getText().trim(), cbFalta.getSelectedItem()});
        });
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio3().setVisible(true)); }
}
