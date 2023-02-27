
package Exemplo03;


import javax.swing.JOptionPane;


public class Tabuada {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Informe o número: ")
        );
        
        StringBuilder sb = new StringBuilder();
        
        //Solução com for
        //fori escreve estrutura for
        /*for (int i = 1; i <= 10; i++) {
            sb.append(
                    String.format(
                "%d x %d = %d\n", num, i, (num*i)
                    )
            );
            
        }*/
        //Segunda solução com while
        int i = 1;
        while(i<=10)
        {
             sb.append(
                    String.format(
                "%d x %d = %d\n", num, i, (num*i)
                    )
            );
             i++;
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
