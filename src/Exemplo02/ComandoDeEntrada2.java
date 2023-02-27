
package Exemplo02;

import javax.swing.JOptionPane;


public class ComandoDeEntrada2 {
    
    public static void main(String[] args) {
        //o Imput sempre considera sempre String
        String str1 = JOptionPane.showInputDialog(
            "Informe o primeiro valor: "
        );
        
        String str2 = JOptionPane.showInputDialog(
           "Informe o segundo valor: "
        );
        
        double soma = Double.parseDouble(str1)+
                      Double.parseDouble(str2);
        
        JOptionPane.showMessageDialog(null, "soma = " + soma);
        
    }
}
