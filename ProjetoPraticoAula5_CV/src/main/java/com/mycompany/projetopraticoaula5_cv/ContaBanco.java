
package com.mycompany.projetopraticoaula5_cv;

//Minha Versão

/*import javax.swing.JOptionPane;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono; 
    private boolean status;
    private double saldo;
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 00.00;
    }
    
    
    public void abrirConta(){
        this.status = true;
        this.tipo = JOptionPane.showInputDialog("Quer abrir uma Conta Corrente ou Poupança? Digite 'cc' para corrente e 'cp' para poupança");
        if (tipo == "cc"){
            this.saldo = 50.00;
            if (tipo == "cp"){
                this.saldo = 150.00;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Digite ou cc ou cp");
        }
    }
    
    public void fecharConta(){
        if (saldo < 00){
            JOptionPane.showMessageDialog(null,"Você tem um débido em abeto no valor de R$"+saldo+" que precisa ser DEPOSITADO antes de fechar a conta!");
            if (saldo > 0){
                JOptionPane.showMessageDialog(null, "Você ainda tem R$"+saldo+" em conta, SAQUE esse valor antes de fechar a conta");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Conta Fechada!!");
            this.status = false;
        }
    }
    
    public void depositar(){
        double dep;
        if (status == false){
            JOptionPane.showMessageDialog(null, "A conta está inativa, ative para poder depositar!!");
        }
        else{
            String textodep = JOptionPane.showInputDialog("Quanto quer depositar?");
            dep = Double.parseDouble(textodep);
            this.saldo = this.saldo + dep;
            dep = 0.00;
        }
    }
    
    public void sacar(){
        double sac;
        if (status == false){
            JOptionPane.showMessageDialog(null, "A conta está inativa!!");
        }
        else{
            String lersac = JOptionPane.showInputDialog("Quanto quer sacar?");
            sac = Double.parseDouble(lersac);
            
            if(sac > saldo){
                JOptionPane.showMessageDialog(null,"Seu saldo é insuficiente para esse saque! Saldo atual: R$"+saldo);
            }
            else{
                JOptionPane.showMessageDialog(null,"Valor Sacado, retire no caixa!!");
            }
        }
    }
    
    public void pagarMensal(){
        if (tipo == "cc"){
            this.saldo = this.saldo - 12.00;
        }
        else{
            this.saldo = this.saldo - 20.00;
        }
    }

    public int getNumConta(){
        return numConta;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String setDono(){
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
}*/


//Versão Gustavo Guanabara:

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual(){
        System.out.print("-----------------------------");
        System.out.print("Conta: "+this.getNumConta());
        System.out.print("Tipo: "+this.getTipo());
        System.out.print("Dono: "+this.getDono());
        System.out.print("Saldo: "+this.getSaldo());
        System.out.print("Status: "+this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc"){
            this.setSaldo(50);
        }
        else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.print("Conta não pode ser fechada pois tem saldo");
        }
        else{
            if (this.getSaldo() < 0){
                System.out.print("Page suas dívidas e depois feche a conta");
            }
            else{
                this.setStatus(false);
                System.out.print("Conta fechada com sucesso");
            }
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado");
        }
        else{
            System.out.println("A conta está inativa!");
        }
        
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso!");
            }
            else{
                System.out.println("Saldo insuficiente!");
            }
        }
        else{
            System.out.println("Sua conta está inativa");
        }
    }
    
    public void pagarMensal(){
        int v;
        if (this.getTipo()== "cc"){
            v = 12;
        }
        else{
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }
        else{
            System.out.println("Sua conta está inativa, mensalidade não pode ser paga!");
        }
    }
    
    
    
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}