/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula003;

import javax.swing.*;
import java.awt.*;

public class Exemplo8_22 extends NFrame
{
	static String A, B ;
	static int resp, a, b ;	

	public Exemplo8_22()
	{
		String A = JOptionPane.showInputDialog(null,"Digite uma variável A:","Entrada",-1);
		int a = Integer.parseInt(A);
		this.a = a;
		String B = JOptionPane.showInputDialog(null,"Digite uma variavel B :","Entrada",-1);
		int b = Integer.parseInt(B);
		this.b = b;
		int resp = JOptionPane.showConfirmDialog(null,"Deseja realmente fazer o calculo ?","Consulta",JOptionPane.YES_NO_CANCEL_OPTION,-1);
		this.resp = resp ;
	}
		public static void main (String arg[])
	{
		
		efetuar();
	}
	public static void efetuar()
	{
		NFrame fx = new Exemplo8_22();
		
		if(resp == 1)
		{
			JOptionPane.showMessageDialog(null,"Não desejo Multiplicar A por B","Resposta",-1);	
			System.exit(0);
		}
		if(resp == 0)
		{
				int c = a*b ;
				JOptionPane.showMessageDialog(null," "+a+" x "+" "+b+" = "+c,"Multiplicando A por B ",-1);
	    		System.exit(0);
		}
		if(resp == 2)
		{
			efetuar() ;			
			
		}	
	}	
}
