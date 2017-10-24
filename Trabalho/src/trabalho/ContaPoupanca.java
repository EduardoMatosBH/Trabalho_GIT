/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 71501118 - Eduardo Gonçalves
 * @author 71501215 - Gustavo Costa
 * @author 71501240 - Lucas de Lelis
 */
public class ContaPoupanca extends Conta {

    private double rendimento;

    public void calcularRendimento(double taxa) {
        if (taxa > 0) {
            this.rendimento = rendimento * taxa;
        } else {
            JOptionPane.showMessageDialog(null, "A taxa deve ser maior que zero!");
        }
        
    }
}
