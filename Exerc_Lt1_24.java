/*
Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_24{
    public static void main(String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO:"));
        if((num % 2) != 0 ){
            if((num % 3) != 0){
                JOptionPane.showMessageDialog(null,"O NÚMERO " + num + " NAO É DIVISIVEL POR 3");
            }
            else{
                JOptionPane.showMessageDialog(null, "O NÚMERO " + num + " É DIVISIVEL POR 3");
            }
        }
        else{
            if((num %3) != 0){
                JOptionPane.showMessageDialog(null, "O NÚMERO " + num + " É DIVISIVEL POR 2");
            }
            else{
                JOptionPane.showMessageDialog(null, "O NÚMERO " + num + " É DIVISIVEL POR 2 E 3");
            }
        }
    }
}
