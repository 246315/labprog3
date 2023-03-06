
package Exemplo04;

import javax.swing.JOptionPane;

/*
    FAÇA UMA CLASSE QUE POSSUA UM MÉTODO QUE RECEBE
UM NÚMERO INTEIRO, REFERENTE A IDADE DE UMA PESSOA, E
RETORNE UMA MENSAGEM:
 DE 0 A 2 ANOS    = BEBÊ
 DE 3 A 11 ANOS   = CRIANÇA
 DE 12 A 19 ANOS  = ADOLECENTE
 DE 20 A 30 ANOS  = JOVEM
 DE 31 A 60 ANOS  = ADULTO
 MAIOR DE 60 ANOS = IDOSO
*/
public class Exercicio03 {
  
    public static void main(String[] args) {
       ExibirMensagem(lerIdade()); 
        
    }
    public static int lerIdade(){
        return Integer.parseInt(
            JOptionPane.showInputDialog("Informe a idade")
        );
    }

    public static void ExibirMensagem(int Idade)
    {
        String msg = "";
        if(Idade >=0 && Idade <=2)
            msg = "Bebê";
        else if(Idade >=3 && Idade <=11)
                    msg = "Criança";
        else if(Idade >=12 && Idade <=19)
                    msg = "Adolecente";
        else if(Idade >=20 && Idade <=30)
                    msg = "Jovem";
        else if(Idade >=31 && Idade <=60)
                    msg = "Adulto";
        else if(Idade >60)
                    msg = "Idoso";
        
        JOptionPane.showMessageDialog(null, msg);            
    }
}