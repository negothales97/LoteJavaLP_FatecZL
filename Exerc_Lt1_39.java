/*
Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: 
Casa: 1 2 3 4 ... 64 
Qte: 1 2 4 8 ... N

Nome do Programador: Thales Serra

Data de Desenvolvimento: 01/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_39{
    public static void main(String[] args) {
        int i, qtd = 1;
        for(i = 1; i< 64; i++){
            qtd = qtd + qtd;
        }
        JOptionPane.showMessageDialog(null, qtd);
    }
}