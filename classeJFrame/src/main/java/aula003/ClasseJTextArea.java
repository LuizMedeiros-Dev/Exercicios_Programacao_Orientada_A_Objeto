package aula003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClasseJTextArea extends ClasseJFrame{
	JTextArea Tx ;
	String msg;
			
	public ClasseJTextArea()
	{
		
		setTitle("Usando a classe JTextArea");
		setBounds(200,150,400,300);
		
		msg = "Este é um exemplo de uso da classe JtextArea."+
		"\nque deve ser instanciada através do uso do construtor :"+
		"\n\nJTextArea tx = new JTextArea ( String texto, int linhas, int colunas )"+
		"\n\nou através do construtor JTextArea( int linhas, int colunas )"+
		"\nObserve que devido ao gerenciador de layout default de JFrame"+
		"\nFlowLayout, não é necessário definir dimensões para este objeto"+
		"\nele automáticamente ocupa todo o espaço do frame."+
		"\nou defina seu próprio Layout"+
		"\natravés de \" getContentPane().setLayout(null); \" ";
		
		Tx = new JTextArea(msg);
                
	
		Tx.setBorder(BorderFactory.createLoweredBevelBorder());
		Tx.setBackground(Color.white);
		Tx.setEditable(true);
		Tx.setVisible(true);


		getContentPane().add(Tx);
                
	}
		public static void main(String[] args) 
 	{
 		ClasseJFrame fx = new ClasseJTextArea();
 		fx.setVisible(true);
 		
 	} 
}

