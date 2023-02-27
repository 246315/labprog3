
package Exemplo03;

public class Funcoes {
    
    public static void main(String[] args) {
        //Static quer dizer que o escopo é global
        int s = soma(15,20);
        exibir(s);
        
    }
    public static int soma(int a, int b)
    {
        return(a*b);
    }
    public static void exibir(int Valor)
    {
        System.out.println(Valor);
    }
}
