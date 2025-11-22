
package Ex_residencia_urbana;

import javax.swing.JOptionPane;

public class Moradia {
    String tipo, status;
    float area;
    double preco;
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null, " Tipo: "+tipo+", Área(m²): "+area+", Preço: R$"+preco+", Status: "+status);
    }
    
    public void construcao(){
        JOptionPane.showMessageDialog(null, tipo+" Está em construção!!");
    }
    
}

