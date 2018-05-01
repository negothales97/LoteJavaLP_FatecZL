/*
Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
Calcule e mostre a velocidade média em km/h.

Nome do Programador: Thales Serra

Data de Desenvolvimento: 24/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_27{
    public static void main(String args[]) {
        double voltas, circuito, tempoDuracao, vm;
        voltas = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O NUMERO DE VOLTAS DADO: "));
        circuito = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A EXTENSAO DO CIRCUITO EM METROS: "));
        tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("INFORME O TEMPO DE DURAÇÃO EM MINUTOS: "));
        vm = ((voltas * (circuito / 1000))/ (tempoDuracao / 60));
        JOptionPane.showMessageDialog(null,"A VELOCIDADE MÉDIA É DE " + vm + "KM/H");
    }
}