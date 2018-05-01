/*
Objetivo: Calcule e mostre quantos anos serão necessários para que Ana 
seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano 
e Maria tem 1,5 m e cresce 2 cm ao ano.

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_43{
    public static void main(String[] args) {
        double ana = 1.10, maria = 1.5, anos = 0;
       do{
           ana = ana + 0.03;
           maria = maria + 0.02;
           anos = anos +1;
       }while(ana <= maria);
       JOptionPane.showMessageDialog(null, "SERÃO NECESSARIOS " + anos + "ANOS\n" + "ALTURA MARIA: " + maria + "\nALTURA ANA: " + ana);
    }
}