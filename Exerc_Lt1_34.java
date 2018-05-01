/*
Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_34{
    public static void main(String[] args) {
        int numero, i, tabuada;
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO: "));
        for(i = 0; i<=10; i++){
            tabuada = i * numero;
            JOptionPane.showMessageDialog(null, numero + " X " + i + " = " + tabuada);
        }
    }
}