package Ex_universidade;

import javax.swing.JOptionPane;


public class Curso {
    String nome, area, horario;
    int vagas, periodos;
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null, "Curso: "+nome+" Área de atuação: "+area+" Horário: "+horario+" Quantidade de Períodos: "+periodos+" Vagas Disponíveis: "+vagas);
    }
    
    public void pos(){
        JOptionPane.showMessageDialog(null, "Pós-graduação liberada para "+nome+", corra e garanta sua vaga!!!");
    }
}