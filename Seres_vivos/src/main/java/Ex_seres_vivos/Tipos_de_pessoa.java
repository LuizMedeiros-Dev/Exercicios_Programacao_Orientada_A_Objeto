
package Ex_seres_vivos;

import javax.swing.JOptionPane;

public class Tipos_de_pessoa {
    String cromossomo,hormonio,voz,forca,sexo;
    
    public void caracteristicas(){
        JOptionPane.showMessageDialog(null, "Tipo: "+sexo+", Cromossomos: "+cromossomo+", hormonio: "+hormonio+", voz: "+voz+", força: "+forca);
    }
}
