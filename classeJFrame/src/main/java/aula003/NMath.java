//Classe Nmath: faz a aproximação do valor double para duas casas decimais.


package aula003;
import java.awt.*;
import java.text.NumberFormat;
import javax.swing.*;
/*Apenas contém o método que faz aproximação do valor double para duas casas decimais. 
  Math.ceil( ): arredonda um numero para cima até o próximo inteiro.
  Math.floor( ): arredonda um numero para baixo até o próximo inteiro.
 Ex.: Se ele for maior ou igual a 0.5, ele arredonda o número para maior.
      Se ele for menor que 0.5, ele arredonda o número para menor.*/

public class NMath
{
	
	public static double decimal2(double A)
	{
		A *=100;
		double B = A- (int)A ;
		if(B>=0.5)
		{			
			A = Math.ceil(A);
			A /=100;
		}
		else
		{			
			A = Math.floor(A);
			A /=100;
		}
		return A ;
	}
}

