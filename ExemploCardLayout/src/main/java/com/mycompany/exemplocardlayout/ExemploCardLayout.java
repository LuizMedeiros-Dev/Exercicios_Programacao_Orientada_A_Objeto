/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplocardlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploCardLayout extends JFrame implements ActionListener {
    JPanel painelPrincipal;
    CardLayout cl;

    public ExemploCardLayout() {
        setTitle("Exemplo CardLayout");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Painel principal com CardLayout
        cl = new CardLayout();
        painelPrincipal = new JPanel(cl);

        // Criando os "cartões"
        JPanel tela1 = new JPanel();
        tela1.add(new JLabel("Tela 1 - Bem-vindo!"));

        JPanel tela2 = new JPanel();
        tela2.add(new JLabel("Tela 2 - Cadastro"));

        JPanel tela3 = new JPanel();
        tela3.add(new JLabel("Tela 3 - Relatório"));

        // Adicionando ao painel principal com nomes
        painelPrincipal.add(tela1, "inicio");
        painelPrincipal.add(tela2, "cadastro");
        painelPrincipal.add(tela3, "relatorio");

        // Botões de navegação
        JButton btn1 = new JButton("Ir para Tela 1");
        JButton btn2 = new JButton("Ir para Tela 2");
        JButton btn3 = new JButton("Ir para Tela 3");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        JPanel botoes = new JPanel();
        botoes.add(btn1);
        botoes.add(btn2);
        botoes.add(btn3);

        // Colocando tudo no JFrame
        add(painelPrincipal, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().contains("1")) {
            cl.show(painelPrincipal, "inicio");
        } else if (btn.getText().contains("2")) {
            cl.show(painelPrincipal, "cadastro");
        } else {
            cl.show(painelPrincipal, "relatorio");
        }
    }

    public static void main(String[] args) {
        new ExemploCardLayout();
    }
}