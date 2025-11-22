

package ExerFinaisAula003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questao3 extends NFrame implements ActionListener {

    private JTextField txtNP1, txtPII, txtNP2, txtExame;
    private JButton btnCalcular;

    public Questao3() {
        super("Cálculo de Notas", 300, 250);
        setLayout(new GridLayout(5, 2, 5, 5));

        txtNP1 = new JTextField();
        txtPII = new JTextField();
        txtNP2 = new JTextField();
        txtExame = new JTextField();

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBackground(Color.cyan);
        btnCalcular.addActionListener(this);

        add(new JLabel("NP1:"));
        add(txtNP1);
        add(new JLabel("PII:"));
        add(txtPII);
        add(new JLabel("NP2:"));
        add(txtNP2);
        add(new JLabel("Exame:"));
        add(txtExame);
        add(new JLabel(""));
        add(btnCalcular);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double np1 = Double.parseDouble(txtNP1.getText());
            double pii = Double.parseDouble(txtPII.getText());
            double np2 = Double.parseDouble(txtNP2.getText());

            double nota = NMath.calcularNota(np1, pii, np2);

            if (nota >= 7.0) {
                JOptionPane.showMessageDialog(this, "Aprovado! Nota = " + nota);
            } else {
                double exame = Double.parseDouble(txtExame.getText());
                double notaFinal = NMath.calcularNotaFinal(nota, exame);
                if (notaFinal >= 5.0) {
                    JOptionPane.showMessageDialog(this, "Aprovado no exame! Nota Final = " + notaFinal);
                } else {
                    JOptionPane.showMessageDialog(this, "Reprovado! Nota Final = " + notaFinal);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Digite valores válidos!");
        }
    }

    public static void main(String[] args) {
        new Questao3();
    }
}