
package aula001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exe3c_cadfamilia extends J2exe1{
    Dimension dim = new Dimension(500,400);
    Button bSalvar, bLimpar;
    TextField txNomePai, txNomeMae, txNomeFilho, txCPFPai, txCPFMae, txCPFFilho;
    Label lNomePai, lNomeMae, lNomeFilho, lCPFPai, lCPFMae, lCPFFilho;
    Font fonte = new Font("Times New Roman",Font.PLAIN,19);
    
    public Exe3c_cadfamilia(){
        setTitle("Cadastro Familiar");
        setResizable(false);
        setSize(dim);
        setLocation(567,200);
        setBackground(Color.lightGray);
        setFont(fonte);
        setLayout(null);
        
        //Labels
        lNomePai = new Label("Nome do Pai: ");
        lNomePai.setBounds(30,50,150,25);
        
        lCPFPai = new Label("CPF do Pai: ");
        lCPFPai.setBounds(30,90,150,25);
        
        lNomeMae = new Label("Nome da Mãe: ");
        lNomeMae.setBounds(30, 130, 150, 25);
        
        lCPFMae = new Label("CPF da Mãe: ");
        lCPFMae.setBounds(30,170,150,25);
        
        lNomeFilho = new Label("Nome do Filho: ");
        lNomeFilho.setBounds(30,210,150,25);
        
        lCPFFilho = new Label("CPF do Filho: ");
        lCPFFilho.setBounds(30,250,150,25);
        
        //TextFields
        txNomePai = new TextField();
        txNomePai.setBounds(180, 50, 200, 25);
        
        txCPFPai = new TextField();
        txCPFPai.setBounds(180, 90, 200, 25);
        
        txNomeMae = new TextField();
        txNomeMae.setBounds(180,130,200,25);
        
        txCPFMae = new TextField();
        txCPFMae.setBounds(180,170,200,25);
        
        txNomeFilho = new TextField();
        txNomeFilho.setBounds(180,210,200,25);
        
        txCPFFilho = new TextField();
        txCPFFilho.setBounds(180,250,200,25);
        
        //Botão Salvar
        bSalvar = new Button("Salvar");
        bSalvar.setBounds(70,320,120,30);
        bSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Seus Dados Foram Salvos!!");
                txNomePai.setText("");
                txCPFPai.setText("");
                txNomeMae.setText("");
                txCPFMae.setText("");
                txNomeFilho.setText("");
                txCPFFilho.setText("");
            }
        });
        
        
        //Botão Limpar
        bLimpar = new Button("Limpar");
        bLimpar.setBounds(250, 320, 120, 30);
        bLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txNomePai.setText("");
                txCPFPai.setText("");
                txNomeMae.setText("");
                txCPFMae.setText("");
                txNomeFilho.setText("");
                txCPFFilho.setText("");
            }
        });
        
        
        //Adicionando Objetos ao Frame
        add(txNomePai);
        add(txCPFPai);
        add(txNomeMae);
        add(txCPFMae);
        add(txNomeFilho);
        add(txCPFFilho);
        add(lNomePai);
        add(lCPFPai);
        add(lNomeMae);
        add(lCPFMae);
        add(lNomeFilho);
        add(lCPFFilho);
        add(bSalvar);
        add(bLimpar);
        
    }
    
    public static void main(String[] args){
        new Exe3c_cadfamilia().setVisible(true);
    }
    
    
    
}
