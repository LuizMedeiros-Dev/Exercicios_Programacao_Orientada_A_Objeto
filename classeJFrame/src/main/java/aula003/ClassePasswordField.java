
package aula003;
import javax.swing.*;
import java.awt.*;

public class ClassePasswordField extends ClasseJTextField
{
	public static JPasswordField Sx ;
	public static JLabel L4, L5, L6, L7;
       
	
	public ClassePasswordField()
	{
		setTitle("Tela de Cadastro Unip");
		
		JLabel L4 = new JLabel();
		this.L4 = L4;
		L4.setText("Digite seu CPF :");
		L4.setBounds(10,120,200,15);
		L4.setFont(F1);
                
                JLabel L5 = new JLabel();
		this.L5 = L5;
		L5.setText("Digite seu RA :");
		L5.setBounds(10,150,200,15);
		L5.setFont(F1);
                
                JLabel L6 = new JLabel();
		this.L6 = L6;
		L6.setText("Digite seu Login :");
		L6.setBounds(10,180,200,15);
		L6.setFont(F1);
                
                JLabel L7 = new JLabel();
		this.L7 = L7;
		L7.setText("Digite sua Senha :");
		L7.setBounds(10,210,200,15);
		L7.setFont(F1);
		
		
		JPasswordField Sx = new JPasswordField();
		this.Sx = Sx ;
		Sx.setEchoChar('¢');
		Sx.setBounds(140,120,200,20);
		
		getContentPane().add(Sx);
		getContentPane().add(L4);
                getContentPane().add(L5);
                getContentPane().add(L6);
                getContentPane().add(L7);
                
		
		
	}
	public static void main ( String arg[])
	{
		ClassePasswordField Er = new ClassePasswordField();
		Er.show(); 
	}
}
