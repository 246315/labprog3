
package Exemplo02;

import javax.swing.JOptionPane;

public class Exercicio2 {
    
     public static void main(String[] args){
        String Nome= "João Victor";
        double Altura = 1.95;
        double Peso = 92.58;

        double Imc = Peso/Math.pow(Altura,2); 
    
        JOptionPane.showMessageDialog(
            null,
            String.format("Nome: %s \nIMC é %.2f", Nome, Imc)
        
    );
   }
}
