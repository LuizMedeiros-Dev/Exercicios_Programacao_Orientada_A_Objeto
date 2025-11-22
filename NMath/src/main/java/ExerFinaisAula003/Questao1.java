

package ExerFinaisAula003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questao1 extends NFrame implements ActionListener {

    private JTextField txtValor, txtCotacao;
    private JButton btnEuroReal, btnRealEuro;

    public Questao1() {
        super("Conversão", 300, 200);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Cotação do Euro:"));
        txtCotacao = new JTextField();
        add(txtCotacao);

        add(new JLabel("Valor:"));
        txtValor = new JTextField();
        add(txtValor);

        btnEuroReal = new JButton("€ → R$");
        btnEuroReal.setBackground(Color.GREEN);
        btnRealEuro = new JButton("R$ → €");
        btnRealEuro.setBackground(Color.GREEN);

        btnEuroReal.addActionListener(this);
        btnRealEuro.addActionListener(this);

        add(btnEuroReal);
        add(btnRealEuro);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double valor = Double.parseDouble(txtValor.getText());
            double cotacao = Double.parseDouble(txtCotacao.getText());

            if (e.getSource() == btnEuroReal) {
                double resultado = NMath.euroParaReal(valor, cotacao);
                JOptionPane.showMessageDialog(this, "Resultado: R$ " + resultado);
            } else {
                double resultado = NMath.realParaEuro(valor, cotacao);
                JOptionPane.showMessageDialog(this, "Resultado: € " + resultado);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Digite valores válidos!");
        }
    }

    public static void main(String[] args) {
        new Questao1();
    }
}
