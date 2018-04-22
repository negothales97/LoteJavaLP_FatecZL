/*
Objetivo: Receba a temperatura em graus Celsius. 
Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_04{
    public static void main(String args[]){
        double temperatura;
        temperatura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A TEMPERATURA EM CELSIUS:"));
        temperatura = ((9 * temperatura + 160) / 5);
        JOptionPane.showMessageDialog(null, "A TEMPERATURA EM FAHRENHEIT É " + temperatura);
    }
}