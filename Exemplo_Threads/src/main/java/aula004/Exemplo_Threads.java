/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula004;



public class Exemplo_Threads
{

	public static void main ( String arg[])
	{
		Tarefa_1 T1 = new Tarefa_1("Tarefa_1");// cria o objeto Tarefa
		T1.setPriority(10);//prioriza a execução da Thread
		
		Tarefa_2 T2 = new Tarefa_2("Tarefa_2");
		T2.setPriority(1);
		
		Tarefa_3 T3 = new Tarefa_3("Tarefa_3");
		T3.setPriority(4);
                
                Tarefa_4 t4 = new Tarefa_4();
                t4.setPriority(6);
                
                Tarefa_5 t5 = new Tarefa_5();
                t5.setPriority(8); 
		
		T1.start();	
		
		T2.start();
	
		T3.start(); 
                
                t4.start();
                
                t5.start();
		
	}
}

