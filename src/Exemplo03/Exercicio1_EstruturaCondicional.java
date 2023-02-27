package Exemplo03;

import javax.swing.JOptionPane;

public class Exercicio1_EstruturaCondicional {
    
    public static void main(String[] args) {
                
        String Nome = JOptionPane.showInputDialog(
                "Informe o produto: "
        );
        double Valor = Double.parseDouble(
                JOptionPane.showInputDialog("Valor do produto")
        );
        
        double Desconto = 0.0;
        
        if(Valor < 0)
        {
            JOptionPane.showMessageDialog(null, "O valor informado precisa ser maior que 0");
        }
        else
        {
          if(Valor >=50 && Valor < 200)
          {
              Desconto = 0.05; //5%
          }
          else if(Valor >=200 && Valor < 500)
          {
              Desconto = 0.06; //6%
          }
          else if(Valor >=500 && Valor  <1000)
          {
              Desconto = 0.07;
          }
          else if(Valor >=100)
          {
              Desconto = 0.08;
          }
          
          JOptionPane.showMessageDialog(
                null,
                String.format(
                    """
                        Produto: %s
                        Valor: R$ %.2f 
                        Valor com Desconto R$ %.2f
                    """,
                    Nome, Valor, (Valor-(Valor*Desconto))
                )
            );
        }
    }
}
