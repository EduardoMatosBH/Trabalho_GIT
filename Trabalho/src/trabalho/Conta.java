/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
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
    private ArrayList<String> extrato;

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

    public void saque(double valor) {
        if (valor <= saldo) {
            setSaldo(saldo - valor);
            this.setExtrato("Saque - " + "\n" + "Data " + System.currentTimeMillis() + " Valor :R$" + valor);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

    public double saldo() {
        System.out.println("Saldo: " + saldo);
        return saldo;
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor deve ser maior que zero! Deposito não efetuado!");
        } else {
            setSaldo(saldo + valor);
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
            this.setExtrato("Depósito - " + "\n" + "Data " + System.currentTimeMillis() + " Valor :R$" + valor);
        }
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(String movimentacao) {
        this.extrato.add(movimentacao);
    }

}
