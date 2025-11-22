package ExerFinaisAula003;

import javax.swing.*;

public class NFrame extends JFrame {
    public NFrame(String titulo, int largura, int altura) {
        super(titulo);
        setSize(largura, altura);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

