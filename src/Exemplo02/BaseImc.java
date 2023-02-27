
package Exemplo02;

import javax.swing.JOptionPane;


public class BaseImc {
    
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog(
            "Informe a sua altura: "
        );
        
        String str2 = JOptionPane.showInputDialog(
            "Informe seu peso: "
        );
       
        double peso = Double.parseDouble(str1);
        double altura = Double.parseDouble(str2);
        
        JOptionPane.showMessageDialog(null,
                String.format("IMC = %.2f", (peso/Math.pow(altura,2)))
        );
    }
}
