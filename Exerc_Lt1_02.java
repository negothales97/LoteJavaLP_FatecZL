/*
Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_02{
    public static void main(String args[]){
        double salario, reajuste;
        reajuste = 0.15;
        salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SALARIO:"));
        salario = (salario + (salario * reajuste));
        JOptionPane.showMessageDialog(null, "O SALARIO É DE: " + salario);
    }
}