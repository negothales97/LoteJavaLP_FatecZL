/*
Objetivo: Receba 100 números inteiros reais. 
Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_38{
    public static void main(String[] args) {
        int maior, valor, i;
        valor = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO MAIOR OU IGUAL A ZERO: "));
        maior = valor;
        for(i=1; i < 100;i++){
            valor = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO MAIOR OU IGUAL A ZERO: "));
            if(valor >= maior){
                maior = valor;
            }
             
        }
        JOptionPane.showMessageDialog(null, "O MAIOR NUMERO E " + maior);
    }
}
