/*
Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial

Nome do Programador: Thales Serra

Data de Desenvolvimento: 02/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_32{
    public static void main(String[] args) {
        int numero, fatorial = 1, i;
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO PARA SABER O FATORIAL:"));
        for(i = 1; i <= numero ;i++){
            fatorial = fatorial * i;
        }
        JOptionPane.showMessageDialog(null, "FATORIAL É " + fatorial);
    }
}