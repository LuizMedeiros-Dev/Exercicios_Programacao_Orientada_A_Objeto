


package ExerFinaisAula003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questao2 extends NFrame implements ActionListener {

    private JTextField txt1, txt2;
    private JButton btnTriangulo, btnQuadrado, btnRetangulo;

    public Questao2() {
        super("Cálculo de Áreas", 300, 200);
        setLayout(new GridLayout(4, 2, 5, 5));

        txt1 = new JTextField();
        txt2 = new JTextField();

        btnTriangulo = new JButton("Triângulo");
        btnTriangulo.setBackground(Color.YELLOW);
        btnQuadrado = new JButton("Quadrado");
        btnQuadrado.setBackground(Color.GREEN);
        btnRetangulo = new JButton("Retângulo");
        btnRetangulo.setBackground(Color.BLUE);

        btnTriangulo.addActionListener(this);
        btnQuadrado.addActionListener(this);
        btnRetangulo.addActionListener(this);

        add(new JLabel("Base/Lado:"));
        add(txt1);
        add(new JLabel("Altura:"));
        add(txt2);

        add(btnTriangulo);
        add(btnQuadrado);
        add(btnRetangulo);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double v1 = Double.parseDouble(txt1.getText());
            double v2 = txt2.getText().isEmpty() ? 0 : Double.parseDouble(txt2.getText());
            double resultado = 0;

            if (e.getSource() == btnTriangulo) {
                resultado = NMath.areaTriangulo(v1, v2);
            } else if (e.getSource() == btnQuadrado) {
                resultado = NMath.areaQuadrado(v1);
            } else if (e.getSource() == btnRetangulo) {
                resultado = NMath.areaRetangulo(v1, v2);
            }

            JOptionPane.showMessageDialog(this, "Área = " + resultado);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Digite valores válidos!");
        }
    }

    public static void main(String[] args) {
        new Questao2();
    }
}