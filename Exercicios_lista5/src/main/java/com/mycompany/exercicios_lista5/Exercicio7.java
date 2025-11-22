/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Exercicio7 extends JFrame {
    private DefaultTableModel model;
    private JTextField tfPiloto, tfCopiloto, tfTipo, tfIdAviao, tfNumVoo, tfHoraChegada, tfHoraPartida;
    public Exercicio7(){
        setTitle("Cadastro Voos - Goiânia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,400);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new GridLayout(2,7,5,5));
        tfPiloto=new JTextField(); tfCopiloto=new JTextField(); tfTipo=new JTextField();
        tfIdAviao=new JTextField(); tfNumVoo=new JTextField(); tfHoraChegada=new JTextField(); tfHoraPartida=new JTextField();
        p.add(new JLabel("Piloto")); p.add(tfPiloto);
        p.add(new JLabel("Co-piloto")); p.add(tfCopiloto);
        p.add(new JLabel("Tipo Avião")); p.add(tfTipo);
        p.add(new JLabel("ID Avião")); p.add(tfIdAviao);
        p.add(new JLabel("Nº Voo")); p.add(tfNumVoo);
        p.add(new JLabel("Hora Chegada")); p.add(tfHoraChegada);
        p.add(new JLabel("Hora Partida")); p.add(tfHoraPartida);
        JButton btnAdd = new JButton("Cadastrar");
        p.add(btnAdd);
        add(p, BorderLayout.NORTH);
        model = new DefaultTableModel(new String[]{"Piloto","Co-piloto","Tipo","ID Avião","Nº Voo","Chegada","Partida"},0);
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        btnAdd.addActionListener(e-> model.addRow(new Object[]{tfPiloto.getText(), tfCopiloto.getText(), tfTipo.getText(), tfIdAviao.getText(), tfNumVoo.getText(), tfHoraChegada.getText(), tfHoraPartida.getText()}));
    }
    public static void main(String[]args){ SwingUtilities.invokeLater(()-> new Exercicio7().setVisible(true)); }
}
