package aula003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClasseJPasswordListener extends ClassePasswordField implements ActionListener
{
	public static String A, B;
	public static int x =0;
	public ClasseJPasswordListener()
	{
		Sx.addActionListener(this);
		Tx1.setText("");
		Tx2.setText("");
	}
	public static void main(String arg[])
	{
		ClasseJPasswordListener Ex = new ClasseJPasswordListener();
		Ex.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		x = x+1;
		String A = Tx1.getText();
		this.A = A;
	
		
		String B = Tx2.getText();
		this.B = B;
	
		
		if(Sx.getText().equals("Jesus"))
		{
		
                    JOptionPane.showMessageDialog(null,"Senha Correta !","Alerta ! ", -1);
		}
		else
		{
			if(x>3)
			{
				JOptionPane.showMessageDialog(null,"Até Logo !","Finalizando ! ",0);
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null,"Senha Errada !","Alerta ! ", -1);
		}
	}
	
}
