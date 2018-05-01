/*
Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_37{
    public static void main(String[] args) {
        int numero, i, a = 0, b = 1, aux;
                numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO:"));
                for(i = 0; i < numero; i++){
                    aux = a + b;
                    a = b;
                    b = aux;
                }
                JOptionPane.showMessageDialog(null, "SÉRIE FIBONACCI DO " + numero + " É " + b);
    }
}