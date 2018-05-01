/*
Objetivo: Receba a hora de início e de final de um jogo (HH,MM) 
sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro

Nome do Programador: Thales Serra

Data de Desenvolvimento: 11/03/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_25{ 
   public static void main (String args []){
       int HoraInicial,MinutoInicial = 0,HoraFinal = 0,MinutoFinal = 0;
       //Recebendo Hora Inicial
       do{
           HoraInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início: "));  
       }while (HoraInicial >23);
       //Recebendo Minuto Inicial
       do{
           MinutoInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a minuto de início: "));
       }while(MinutoInicial >59);
       //Recebendo Hora Final
       do{
           HoraFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de final do jogo: "));
       }while(HoraFinal > 23);
       //Recebendo Minuto Final
       do{
           MinutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de final do jogo: "));
       }while(MinutoFinal > 59);
       
       
       CalculaTempoJogo(HoraInicial,MinutoInicial,HoraFinal,MinutoFinal);
    }
   
   //Calcula o tempo do Jogo
   public static void CalculaTempoJogo(int hi,int mi,int hf,int mf){
       
       int horaResult,minResult;
       
       if(hi < hf & mi < mf){
           horaResult = hf - hi;
           minResult = mf - mi;
           JOptionPane.showMessageDialog(null,"Tempo de jogo: "+horaResult+":"+minResult);
       }else if(hi < hf & mi > mf){
           horaResult = (hf - hi) - 1;
           minResult = (mf + 60) - mi;
           JOptionPane.showMessageDialog(null,"Tempo de jogo: "+horaResult+":"+minResult);
       }else if(hi > hf & mi < mf){
           horaResult = (hf + 24) - hi;
           minResult = mf - mi;
           JOptionPane.showMessageDialog(null,"Tempo de jogo: "+horaResult+":"+minResult);
       }else if(hi > hf & mi > mf){
           horaResult = ((hf + 24) - hi) - 1;
           minResult = (mf + 60) - mi;
           JOptionPane.showMessageDialog(null,"Tempo de jogo: "+horaResult+":"+minResult);
       }
   }
}