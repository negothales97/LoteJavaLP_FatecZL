/*
Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_18{
    public static void main(String args[]) {
        int valor1, valor2, diferenca;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NÚMERO: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NÚMERO: "));
        if(valor1 >= valor2){
            diferenca = valor1 - valor2;
        }
        else{
            diferenca = valor2 - valor1;
        }
        JOptionPane.showMessageDialog(null, "A DIFERENCA DOS DOIS VALORES É DE " + diferenca);
    }
}
      