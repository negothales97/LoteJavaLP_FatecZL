/*
Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_35{
    public static void main(String[] args) {
        int num1, num2, i, soma = 0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO:"));
        if(num1 >= num2){
            for(i=num2; i<= num1; i++){
                if((i%2)==1){
                    soma = soma + i;
                }
            }
            JOptionPane.showMessageDialog(null," O MAIOR NUMERO É: " + num1 + " A SOMA DOS NUMEROS IMPARES É " + soma);
            
        }
        else{
            for(i=num1; i<= num2; i++){
                if((i%2)==1){
                    soma = soma + i;
                }
            }
            JOptionPane.showMessageDialog(null," O MAIOR NUMERO É: " + num2 + " A SOMA DOS NUMEROS IMPARES É " + soma);
            
        }
    }
}