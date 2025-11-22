/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import DAO.UserDAO;
import Model.User;

public class TelaUser extends JFrame {
    private JTextField txtId, txtNome, txtSobrenome, txtData, txtEmail;
    private JTextArea areaLista;
    private UserDAO dao = new UserDAO();

    public TelaUser() {
        setTitle("Cadastro de Usuários");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("ID:"));
        txtId = new JTextField(5);
        add(txtId);

        add(new JLabel("Nome:"));
        txtNome = new JTextField(10);
        add(txtNome);

        add(new JLabel("Sobrenome:"));
        txtSobrenome = new JTextField(10);
        add(txtSobrenome);

        add(new JLabel("Data Nasc (AAAA-MM-DD):"));
        txtData = new JTextField(10);
        add(txtData);

        add(new JLabel("Email:"));
        txtEmail = new JTextField(15);
        add(txtEmail);

        JButton btnAdd = new JButton("Cadastrar");
        btnAdd.setBackground(Color.green);
        JButton btnList = new JButton("Listar");
        btnList.setBackground(Color.yellow);
        JButton btnUpd = new JButton("Atualizar");
        btnUpd.setBackground(Color.LIGHT_GRAY);
        JButton btnDel = new JButton("Excluir");
        btnDel.setBackground(Color.red);
        add(btnAdd);
        add(btnList);
        add(btnUpd);
        add(btnDel);

        areaLista = new JTextArea(10, 40);
        add(new JScrollPane(areaLista));

        btnAdd.addActionListener(e -> {
            User u = new User();
            u.setFirstname(txtNome.getText());
            u.setLastname(txtSobrenome.getText());
            u.setDob(Date.valueOf(txtData.getText()));
            u.setEmail(txtEmail.getText());
            dao.inserir(u);
        });

        btnList.addActionListener(e -> {
            areaLista.setText("");
            for (User u : dao.listar()) {
                areaLista.append("ID: " + u.getUserid() + " | Nome: " + u.getFirstname() +
                                 " | Sobrenome: " + u.getLastname() +
                                 " | Nasc: " + u.getDob() +
                                 " | Email: " + u.getEmail() + "\n");
            }
        });

        btnUpd.addActionListener(e -> {
            User u = new User();
            u.setUserid(Integer.parseInt(txtId.getText()));
            u.setFirstname(txtNome.getText());
            u.setLastname(txtSobrenome.getText());
            u.setDob(Date.valueOf(txtData.getText()));
            u.setEmail(txtEmail.getText());
            dao.atualizar(u);
        });

        btnDel.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            dao.excluir(id);
        });
    }

    public static void main(String[] args) {
        new TelaUser().setVisible(true);
    }
}

