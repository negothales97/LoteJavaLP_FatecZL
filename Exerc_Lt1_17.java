/*
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
Receber o tempo de percurso e a velocidade média

Nome do Programador: Thales Serra

Data de Desenvolvimento: 20/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_17{
    public static void main(String args[]){
        double vm, s, x;
        vm = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA VELOCIDADE MEDIA:"));
        s = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O TEMPO DO PERCURSO:"));
        x = ((vm * s)/12);
        JOptionPane.showMessageDialog(null," A QUANTIDADE DE LITROS GASTOS É DE " + x + "LTS");
    }
}