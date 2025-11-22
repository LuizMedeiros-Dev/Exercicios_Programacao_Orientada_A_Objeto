package aula003;

import javax.swing.*;
import java.awt.*;

public class ClasseJFrame1 extends ClasseJFrame {
    public ClasseJFrame1() {
        setLocation(50, 100);// Localização
        setSize(600, 450);// Tamanho do Frame
        getContentPane().setBackground(Color.BLUE);/*Painel Root Pane gerenciado pelo
                                                    *JRootPane – javax.swing – aplicando no
                                               Frame o método setBackground.*/
    }

    public static void main(String arg[]) {
        new ClasseJFrame1().setVisible(true);
    }
}

