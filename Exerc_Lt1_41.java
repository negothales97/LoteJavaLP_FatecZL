/*
Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_41{
    public static void main(String[] args) {
        int i, dado1=1, dado2 =6, dado;
        for(i = dado1; i<=6;i++){
            dado = i + dado2;
            JOptionPane.showMessageDialog(null,i + " E " + dado2 + " = " + dado);
            dado2--;
        }
    }
}
