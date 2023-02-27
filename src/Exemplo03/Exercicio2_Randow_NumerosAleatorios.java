
package Exemplo03;

import javax.swing.JOptionPane;

public class Exercicio2_Randow_NumerosAleatorios {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Números sorteados").append("\n");
        
        int Soma= 0;
        for (int i = 0; i < 3; i++) {
            int Jogada = (int)(Math.random()*6)+1;
            Soma += Jogada;
            
            sb.append(String.format(
                "Jogada %d = %d\n", i,Jogada
                )
            );
        }
        sb.append("Total = ").append(Soma);
        JOptionPane.showMessageDialog(null, sb.toString());
        
        
        System.out.println(Math.random()*6);
    }
}
