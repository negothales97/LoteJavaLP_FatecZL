/*
Objetivo: Receba o valor de um depósito em poupança. 
Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. 

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_08{
    public static void main(String args[]){
        double valor, juros;
        valor = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO DEPOSITO"));
        juros = 0.013;
        valor = valor + (valor * juros);
        JOptionPane.showMessageDialog(null, "O VALOR DO DEPOSITO COM OS RENDIMENTOS É DE " + valor);
    }
}