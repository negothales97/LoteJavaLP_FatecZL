/*
Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_23{
    public static void main(String args[]) {
        double valor1, valor2, valor3, valor4;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO: "));
        valor3 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE MAIS UM NUMERO: "));
        valor4 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO ALEATORIO: "));
        if(valor4 >= valor3){
            JOptionPane.showMessageDialog(null,"\n" + valor1 + "\n" + valor2 + "\n" + valor3 + "\n" + valor4);
        }
        else{
            if(valor4 >=valor2){
                JOptionPane.showMessageDialog(null,"\n" + valor1 + "\n" + valor2 + "\n" + valor4 + "\n" + valor3);
            }
            else{
                if(valor4 >= valor1){
                    JOptionPane.showMessageDialog(null,"\n" + valor1 + "\n" + valor4 + "\n" + valor2 + "\n" + valor3);
                }
                else{
                    JOptionPane.showMessageDialog(null,"\n" + valor4 + "\n" + valor1 + "\n" + valor2 + "\n" + valor3);
                }
            }
        }
    }
}