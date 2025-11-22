package Ex_Moradia;

import javax.swing.JOptionPane;

public class Casa {
    String tipo, status;
    float area;
    double preco;
    int quartos;
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null, "Tipo: "+tipo+"Área(m²): "+area+"Quartos: "+quartos+"Preço: R$"+preco+"Status: "+status);
    }
    
}