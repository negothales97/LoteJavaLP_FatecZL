/*
Objetivo:Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostrE

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
public class Exerc_Lt1_20{
    public static void main(String args[]) {
     double a, b, c, x1, x2, delta;
     a = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DE a:"));
     b = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DE b:"));
     c = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DE c:"));
     delta = ((b*b)-(4 * a * c));
     if(delta <= 0){
         JOptionPane.showMessageDialog(null, "NÃO EXISTE RAÍZ REAL: ");
     }
     else{
        x1 = (((-b)+(sqrt(delta))) / (2 * a));
        x2 = (((-b)-(sqrt(delta))) / (2 * a));
        JOptionPane.showMessageDialog(null, "VALOR DE X1: " + x1 + "\nVALOR DE X2: " + x2); 
     }
        
    }
}
