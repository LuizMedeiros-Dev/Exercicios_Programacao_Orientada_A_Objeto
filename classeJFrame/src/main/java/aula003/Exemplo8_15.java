/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo8_15 extends Exemplo8_14 implements ActionListener
{
	public Exemplo8_15()
	{
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B5)
		{
			Lx1.setVisible(true);
			Lx2.setVisible(false);
			Lx3.setVisible(false);
			Lx4.setVisible(false);
			Lx5.setVisible(false);
			Lx6.setVisible(false);
		}
		if(e.getSource()==B6)
		{
			Lx2.setVisible(true);
			Lx1.setVisible(false);
			Lx3.setVisible(false);
			Lx4.setVisible(false);
			Lx5.setVisible(false);
			Lx6.setVisible(false);
		}
		if(e.getSource()==B1)
		{
			Lx3.setVisible(true);
			Lx2.setVisible(false);
			Lx1.setVisible(false);
			Lx4.setVisible(false);
			Lx5.setVisible(false);
			Lx6.setVisible(false);
		}
		if(e.getSource()==B2)
		{
			Lx4.setVisible(true);
			Lx2.setVisible(false);
			Lx3.setVisible(false);
			Lx1.setVisible(false);
			Lx5.setVisible(false);
			Lx6.setVisible(false);
		}
		if(e.getSource()==B3)
		{
			Lx5.setVisible(true);
			Lx2.setVisible(false);
			Lx3.setVisible(false);
			Lx4.setVisible(false);
			Lx1.setVisible(false);
			Lx6.setVisible(false);
		}
		if(e.getSource()==B4)
		{
			Lx6.setVisible(true);
			Lx2.setVisible(false);
			Lx3.setVisible(false);
			Lx4.setVisible(false);
			Lx5.setVisible(false);
			Lx1.setVisible(false);
		}
	}
	public static void main(String arg[])
	{
		NFrame fx = new Exemplo8_15();
		fx.show();
	}
}	