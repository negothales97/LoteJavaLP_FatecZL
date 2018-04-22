    /*
Objetivo: Coletar o valor do lado de um quadrado, calcular sua área  apresentar o resultado

Nome do Programador: Thales Serra

Data de Desenvolvimento: 15/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_01{
    public static void main(String args[]){
        double lado, area;
        lado = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO LADO:"));
        area = (lado * lado);
        JOptionPane.showMessageDialog(null, "A AREA DO QUADRADO: " + area);
    }
}