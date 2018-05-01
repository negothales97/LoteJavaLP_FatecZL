/*
Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_31{
    public static void main(String[] args) {
        int num1, quadrado, i;
        for(i = 10;i<=150;i++){
            num1 = i;
            quadrado = (num1 * num1);
            JOptionPane.showMessageDialog(null,"QUADRADO DE " + i + " É " + quadrado);
        }
    }
}