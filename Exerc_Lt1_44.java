/*
Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_44{
    public static void main(String[] args) {
        int base, expoente, potencia = 0, i, soma;
        base = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A BASE: "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O EXPOENTE: "));
        
        for(i = expoente;i>1;i--){
            soma = base * base;
            potencia = potencia + soma;
        }
        JOptionPane.showMessageDialog(null, potencia);
        
        
    }
}