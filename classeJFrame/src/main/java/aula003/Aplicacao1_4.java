//Quarta classe: Quando o botão B2 é acionado, o programa precisa executar vários cálculos e operações de captura de erros. 
//Então o método actionPerformed() faz a camada ao método calcularConsumo() da classe aplicação1_4 que é uma classe auxiliar 
//que não herda nada das anteriores. São feitos aqui apenas cálculos relativos à autonomia e consumo do carro e são 
//resguardados os possíveis erros do digitador pela estrutura de captura de erros. 

package aula003;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aplicacao1_4
{
	static String K1, K2,L ;
	static double ant, at, l, aut, rend ;
	
	public static void calcularConsumo()
	{
		try
		{
			K1 = Aplicacao1_2.Tx1.getText();//trás informação do JtextField
			K1 = K1.replace(',','.');// Se chegar , aqui, troca pra ponto
			ant = Double.parseDouble(K1);
			K2 = Aplicacao1_2.Tx2.getText();
			K2 = K2.replace(',','.');
			at = Double.parseDouble(K2);
			L = Aplicacao1_2.Tx3.getText();
			L = L.replace(',','.');
			l = Double.parseDouble(L);
			aut = at - ant ;
				if(aut<=0)
				{
					JOptionPane.showMessageDialog(null,"A kilometragem atual deve ser \n maior do que a anterior","Erro",0);
				    return ;
				}
			rend = aut/l ;
			rend = NMath.decimal2(rend);
			JOptionPane.showMessageDialog(null,"O consumo foi de :"+" "+rend+" Km / L\n a autonomia foi de "+
			aut+"  Kilometros","Resultado",-1);
		}
		catch(NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(null,"Digite apenas números !","Erro !", 0);
		}
	}
}
