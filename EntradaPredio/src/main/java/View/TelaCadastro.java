/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import javax.swing.*;
import java.awt.*;
import DAO.PessoaDAO;
import Model.Pessoa;

public class TelaCadastro extends JFrame {
    private JTextField txtNome;
    private JTextArea areaLista;
    private PessoaDAO dao = new PessoaDAO();

    public TelaCadastro() {
        setTitle("Entrada de Pessoas no Prédio");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nome:"));
        txtNome = new JTextField(20);
        add(txtNome);

        JButton btnCadastrar = new JButton("Cadastrar Entrada");
        btnCadastrar.setBackground(Color.green);
        add(btnCadastrar);

        areaLista = new JTextArea(10, 30);
        add(new JScrollPane(areaLista));

        btnCadastrar.addActionListener(e -> {
            String nome = txtNome.getText();
            if (!nome.isEmpty()) {
                dao.inserir(new Pessoa(nome));
                atualizarLista();
                txtNome.setText("");
            }
        });
    }

    private void atualizarLista() {
        areaLista.setText("");
        for (Pessoa p : dao.listar()) {
            areaLista.append("Código: " + p.getCodigo() + " | Nome: " + p.getNome() + "\n");
        }
    }

    public static void main(String[] args) {
        new TelaCadastro().setVisible(true);
    }
}
