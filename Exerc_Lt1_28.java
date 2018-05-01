/*
Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o
novo preço sabendo que:
Venda mensal        Preço Atual     Preço Novo
<500                < 30                +10%
>= 500 e < 1000     >= 30 e < 80        +15%
>= 1000             >= 80               -5%
Obs.: para outras condições, preço novo será igual ao preço atual.

Nome do Programador: Thales Serra

Data de Desenvolvimento: 11/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_28{
    public static void main(String args[]) {
        double precoAtual, vendaMensal;
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O MÉDIA MENSAL: "));
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PREÇO ATUAL: ")); 
        if(vendaMensal < 500){
            if(precoAtual < 30){
                precoAtual = precoAtual + (precoAtual * 0.10);
            }
            else{
                precoAtual = precoAtual + 0;
            }
        }
        else{
            if(vendaMensal < 1000){
                if(precoAtual >=30 && precoAtual <80){
                    precoAtual = precoAtual + (precoAtual * 0.15); 
                }
                else{
                    precoAtual = precoAtual + 0;
                }
            }
            else{
                if(precoAtual >= 80){
                        precoAtual = precoAtual - (precoAtual * 0.05);  
                }
                else{
                    precoAtual = precoAtual + 0;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O PREÇO NOVO É " + precoAtual);
    }
}