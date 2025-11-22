package aula003;

import javax.swing.*;

public class ClasseJFrame2 extends ClasseJFrame1 {
    public ClasseJFrame2() {
        super();
        setLocation(50, 100);
        setSize(600, 450);
        setUndecorated(true);// decoração
        getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);
        /*
         * Altera alguns detalhes na aparência do Frame: São 8 as
         * constantes do DecoratedStyle
         * NONE
         * FRAME
         * INFORMATION_DIALOG
         * ERROR_DIALOG
         * COLOR_CHOOSER_DIALOG
         * FILE_CHOOSER_DIALOG
         * QUESTION_DIALOG
         * WARNING_DIALOG
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
            /* Permite uma açao de fechamento pelo método setDefaultCloseOperation() 
            * HIDE_ON_CLOSE: oculta a janela quando o usuario determina o
            * fechamento- valor default da classe
            * DO_NOTHING_ON_CLOSE: não executa nenhuma ação, desativa o botão
            * fechamento
            * DISPOSE_ON_CLOSE: faz desaparecer a janela e libera os recursos
            * usados pela classe usados pela JVM
            * EXIT_ON_CLOSE: faz encerrar o aplicativo de uma forma equivalente ao
            * uso de um System.exit(0);*/
    }

    public static void main(String arg[]) {
        new ClasseJFrame2().setVisible(true);
    }
}
