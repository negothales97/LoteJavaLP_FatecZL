/*
Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

Nome do Programador: Thales Serra

Data de Desenvolvimento: 06/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_45{
    public static void main(String[] args){
        double valor, quadrado, soma = 0;
        int i;
        for(i = 1; i <= 15; i++){
            quadrado = i * i;
            valor = i/quadrado;
            soma = soma + valor;
        }
        JOptionPane.showMessageDialog(null, soma);
    }
}