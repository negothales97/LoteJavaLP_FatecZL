/*
Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_12{
    public static void main(String args[]){
        int anoNasc, anoAtual, idadeAtual, idadeFutura;
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O SEU ANO DE NASCIMENTO:"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ANO ATUAL:"));
        idadeAtual = anoAtual - anoNasc;
        idadeFutura = idadeAtual + 17;
        JOptionPane.showMessageDialog(null, "SUA IDADE É DE " + idadeAtual + " E DAQUI A 17 ANOS VOCÊ TERÁ " + idadeFutura);
    }
}