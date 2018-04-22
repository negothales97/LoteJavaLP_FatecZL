/*
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes.
Calcule o salário que serão as horas trabalhadas x o valor por hora. 
Calcule o salário líquido (= Salário Bruto – desconto).
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

Nome do Programador: Thales Serra

Data de Desenvolvimento: 20/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_16{
    public static void main(String args[]){
        double horasTrab, valorHora, porDesc,dependentes, salario, salarioBruto, salarioLiquido;
        horasTrab = Double.parseDouble(JOptionPane.showInputDialog("DIGITE AS HORAS TRABALHADAS: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA HORA: "));
        porDesc = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PERCENTUAL DE DESCONTO: "));
        dependentes = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O NUMERO DE DEPENTES: "));
        salarioBruto = (horasTrab * valorHora);
        salarioLiquido = salarioBruto - (porDesc/100);
        salario = ((dependentes * 100)+ salarioLiquido);
        JOptionPane.showMessageDialog(null,"O SALARIO LIQUIDO É DE " + salario);
    }
}