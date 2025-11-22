

//Terceira classe: esta é subclasse da anterior e implementa a interface ActionListener, na qual serão definidas as ações que os botões vão executar.

package aula003;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aplicacao1_3 extends Aplicacao1_2 implements ActionListener
{
	Aplicacao1_3()
	{
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B1)
		{
			Tx1.setText(" ");
			Tx2.setText(" ");
			Tx3.setText(" ");
		}
		if(e.getSource()==B2)
		{
			Aplicacao1_4.calcularConsumo();			
		}
		if(e.getSource()==B3)
		{
			System.exit(0);
		}
		
	}
	public static void main ( String arg[])
	{
		NFrame Fx = new Aplicacao1_3();
		Fx. show();
	}
}
