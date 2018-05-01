/*
Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_33{
    public static void main(String[] args) {
        double valor, calculo, soma = 0, i;
        valor = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO POSITIVO:"));
        for(i = 1; i <= valor; i++){
            calculo = 1/i;
            soma = soma + calculo;
            
        }
        JOptionPane.showMessageDialog(null, "VALOR CALCULADO: " + soma);
    }
}