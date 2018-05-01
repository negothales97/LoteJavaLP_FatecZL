/*
Objetivo: Receba 2 números inteiros. 
Verifique e mostre todos os números primos existentes entre eles

Nome do Programador: Thales Serra

Data de Desenvolvimento: 11/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_40{
    public static void main(String[] args) {
        int num1, num2, j, i, div = 0;
        do{
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO E POSITIVO: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO E POSITIVO: "));    
        }while (num1 <=0 || num2 <= 0);
        
        if(num1 > num2){
            for(i = num2; i <= num1; i++){
                for(j=1;j<=i;j++){
                   if(i % j == 0){
                    div++; 
                   } 
                }
                if(div == 2){
                   JOptionPane.showMessageDialog(null, i);
                }
                div = 0;
            }
        }
        else{
            for(i = num1; i <= num2; i++){
                for(j=1;j<=i;j++){
                   if(i % j == 0){
                    div++; 
                   } 
                }
                if(div == 2){
                   JOptionPane.showMessageDialog(null, i);
                }
                div = 0;
            }
        }
    }
}