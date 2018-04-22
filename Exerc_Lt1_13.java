/*
Objetivo: Receba a quantidade de alimento em quilos. 
Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia

Nome do Programador: Thales Serra

Data de Desenvolvimento: 19/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_13{
    public static void main(String args[]){
        double quantidade, dias, conversao;
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE ALIMENTO EM QUILOS: "));
        conversao = (quantidade * 1000);
        dias = conversao/50;
        JOptionPane.showMessageDialog(null, quantidade + " QUILO(S) DE ALIMENTO DURA(M) " + dias + " DIAS");
    }
}