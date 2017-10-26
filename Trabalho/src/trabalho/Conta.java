/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author 71501118
 */
public class Conta {
    private String titular;
    private int ag;
    private int conta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void saque(double valor){
        if(valor <= saldo){
        setSaldo(saldo-valor);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    public double saldo(){
        
        System.out.println("Saldo: " +saldo);
        
        return saldo;
    }
    public void extrato(){
    }
    public void deposito(){
    }
    
}
