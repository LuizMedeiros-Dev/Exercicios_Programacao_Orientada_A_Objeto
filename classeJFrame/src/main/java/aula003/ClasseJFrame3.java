package aula003;

import javax.swing.*;
import java.awt.*;

public class ClasseJFrame3 extends ClasseJFrame1 {

    public ClasseJFrame3() {
        super();
        setLocation(50, 100);
        setSize(600, 450);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.red, 100));
        /*
         * Classe BorderFactory trata as bordas
         * Sugestao: visitar a documentacao dessa classe na API do Java
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    public static void main(String arg[]) {
        new ClasseJFrame3().setVisible(true);
    }
}
