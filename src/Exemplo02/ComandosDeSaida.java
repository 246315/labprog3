package Exemplo02;

import javax.swing.JOptionPane;

public class ComandosDeSaida {

    public static void main(String[] args){
        
        System.out.print("Segunda\n");
        System.out.println("Terça");
        
        //A questão do null é que a caixinha fica livre em toda a tela
        JOptionPane.showMessageDialog(
        null,
        "Programando em Java!"
        );
        
        JOptionPane.showMessageDialog(
            null,
            "Demostração do uso da caixa "
            + "de diálogo na linguagem Java",
            "Lab.Programação III",
            JOptionPane.WARNING_MESSAGE
        );
    
    }
    
}
