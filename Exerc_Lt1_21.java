/*
Objetivo:Receba Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média: 
a. Se a média for >= 6,0 exibir “APROVADO”; 
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”. 

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_21{
    public static void main(String args[]) {
        double nota1, nota2, nota3, nota4, media;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A NOTA DO 1º BIMESTRE:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A NOTA DO 2º BIMESTRE:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A NOTA DO 3º BIMESTRE:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A NOTA DO 4º BIMESTRE:"));
        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media >= 6){
            JOptionPane.showMessageDialog(null, "APROVADO");
        }
        else{
            if(media < 3){
            JOptionPane.showMessageDialog(null, "RETIDO");
            }
            else{ 
                JOptionPane.showMessageDialog(null, "EXAME");
            }
        }
    }
}