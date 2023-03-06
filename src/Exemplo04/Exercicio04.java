
package Exemplo04;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
    UM SORTEIO DE BRINDES SERÁ FEITO EM UM SUPERMERCADO
    ESTE MÊS. FAÇA UMA CLASSE QUE FORNEÇA DEZ NOMES DE
    BRINDES E SORTEIR UM DESSES BRINDES POR MEIO DE UM
    MÉTODO CHAMADO -SORTEIO-.

*/
public class Exercicio04 {
    public static void main(String[] args) {
        String brindes[] = {"Caneta", "Mouse", "Teclado",
        "Placa-Mãe", "Monitor", "Mousepad", "Fone-De-Ouvido",
        "Celular", "Caneca", "Notebook"};
        
    ExibirSorteado(Sorteio(brindes.length), brindes);
    }    
    
    
    
   /* public static void ExibirBrindes(String b[])
    {
        Arrays.sort(b);
        JOptionPane.showMessageDialog(
             null, Arrays.toString(b)
        );
    }*/
    
    public static int Sorteio(int Total)
    {
        return (int) (Math.random()*Total)+1;
    }
    
    public static void ExibirSorteado(int Num, String b[])
    {
        JOptionPane.showMessageDialog(
          null,
          String.format(
            "BRINDES \n%s \n\nNÚMERO SORTEADO: %d \nBRINDE: %s",
            Arrays.toString(b), Num, b[Num-1].toUpperCase()
          )
        );
        
        }
    }