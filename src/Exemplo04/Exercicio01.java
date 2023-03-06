
package Exemplo04;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
    ELABORE UMA CLASSE QUE RECEBA 5 NOTAS
DE ALUNOS POR MEIO DE ShowInputDialog, ARMAZENE ESSAS
NOTAS EM UM ARRAY DE CINCO ELEMENTOS, APRESENTE EM TELA AS CINCO NOTAS
EM ORDEM DECRESCENTE (DA MAIOR PARA A MENOR) E A MÉDIA ARITMÉTICA
DAS NOTAS.
*/
public class Exercicio01 {
    
    public static void main(String[] args) {
        double Notas [] = new double[5];
        //double Notas [] = {8.5, 9.2, 6.3, 4.9, 9,7}
        double Soma = 0;
        for (int i = 0; i < Notas.length; i++) {
            Notas[i] = Double.parseDouble(
                JOptionPane.showInputDialog(
                   "Nota" + (i+1) + ": "
                )
            );
            Soma += Notas[i];        
            
        }
        //Aqui ele ordena
        Arrays.sort(Notas);
       
        //Aqui ele começa com -1 pq ele vai do ultimo numero ao primeiro
        int i = Notas.length -1;
        
        StringBuilder sb = new StringBuilder();
        sb.append("NOTAS").append("\n");
        while(i>=0)
        {
            sb.append(String.format("%.1f\n", Notas[i]));
            i--;
        }
        sb.append(
            String.format("Média: %.1f\n", (Soma / Notas.length))
        );
        JOptionPane.showMessageDialog(null, sb);
    }
}
