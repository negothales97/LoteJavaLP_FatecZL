/*
Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados

Nome do Programador: Thales Serra

Data de Desenvolvimento: 26/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_29{
    public static void main(String args[]) {
        double tipoInv, valor, rendimento;
        tipoInv = Double.parseDouble(JOptionPane.showInputDialog("SELECIONE 1 PARA POUPANÇA E 2 PARA RENDA FIXA: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR QUE SERÁ INVESTIDO: "));
        if(tipoInv == 1){
            rendimento = valor + (valor * (3/100));
        }
        else{
            rendimento = valor + (valor * (5/100));
        }
        JOptionPane.showMessageDialog(null, "O SEU RENDIMENTO É DE " + rendimento);
    }
}