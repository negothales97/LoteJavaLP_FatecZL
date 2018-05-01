/*
Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

Nome do Programador: Thales Serra

Data de Desenvolvimento: 11/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_36{
    public static void main(String[] args) {
        int numero, i, j;
        double calculo, soma = 0, fatorial = 1;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO: "));
        }while(numero <= 0);
        
        for(i = 1; i <= numero; i++){
            for(j = 1; j <= i; j++){               
                fatorial = fatorial * j;
            }
            calculo = 1/fatorial;
            soma = soma + calculo;
            fatorial = 1;
        }
        soma = soma + 1;
        JOptionPane.showMessageDialog(null, "VALOR CALCULADO: " + soma);
    }
}