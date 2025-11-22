
package aula003;

import javax.swing.*;

public class ClasseJFrame extends JFrame {
    public ClasseJFrame() {
        setTitle("Descobrindo JFrame");
        setBounds(200, 150, 400, 300); /* parametros corresponden a 
                                          posicao x,y, altura e largura*/
    }

    public static void main(String arg[]) {
        ClasseJFrame Ex = new ClasseJFrame();
        Ex.setVisible(true);
    }
}
