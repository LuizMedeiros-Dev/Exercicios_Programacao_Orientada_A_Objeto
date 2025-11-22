/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Exercicio10 extends JFrame {
    private DefaultTableModel model;
    private JTextField tfNome, tfTelefone, tfPlano, tfEspecialidade, tfIdade, tfMedicamento;
    private JCheckBox cbToma;
    public Exercicio10(){
        setTitle("Controle Pacientes Hospital");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(2,6,5,5));
        tfNome=new JTextField(); tfTelefone=new JTextField(); tfPlano=new JTextField();
        tfEspecialidade=new JTextField(); tfIdade=new JTextField(); tfMedicamento=new JTextField();
        cbToma=new JCheckBox("Está tomando medicamento?");
        p.add(new JLabel("Nome")); p.add(tfNome);
        p.add(new JLabel("Telefone")); p.add(tfTelefone);
        p.add(new JLabel("Plano Saúde")); p.add(tfPlano);
        p.add(new JLabel("Especialidade")); p.add(tfEspecialidade);
        p.add(new JLabel("Idade")); p.add(tfIdade);
        p.add(cbToma); p.add(tfMedicamento);
        JButton btnAdd=new JButton("Cadastrar");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Nome","Telefone","Plano","Especialidade","Idade","Toma Medicamento","Medicamento"},0);
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        btnAdd.addActionListener(e->{
            model.addRow(new Object[]{tfNome.getText(), tfTelefone.getText(), tfPlano.getText(), tfEspecialidade.getText(), tfIdade.getText(), cbToma.isSelected() ? "Sim" : "Não", cbToma.isSelected() ? tfMedicamento.getText() : ""});
        });
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio10().setVisible(true)); }
}

