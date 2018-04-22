/*
Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes). 

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
public class Exerc_Lt1_05{
    public static void main(String args[]){
        double a, b, c, x1, x2, delta;
        a = Double.parseDouble(JOptionPane.showInputDialog("DIGTE O VALOR DE A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DE B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DE C"));
        delta = ((b*b)-(4 * a * c));
        x1 = (((-b)+(sqrt(delta))) / (2 * a)); //Verificar como utilizar Raiz em Java
        x2 = (((-b)-(sqrt(delta))) / (2 * a)); //Verificar como utilizar Raiz em Java
        JOptionPane.showMessageDialog(null, "O VALOR DE X1 É " + x1 + " E X2 É " + x2);
    }
}