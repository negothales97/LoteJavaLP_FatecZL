/*
Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

Nome do Programador: Thales Serra

Data de Desenvolvimento: 11/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_42{
    public static void main (String[] args){
        double total, soma=0, num = 1;
        int i;
        for(i=1;i<=50;i++){
            total = i / num;
            soma = soma + total;
            num = num + 2;
        }
        JOptionPane.showMessageDialog(null, soma);
    }
}