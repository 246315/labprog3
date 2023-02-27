
package Exemplo02;

public class Exercicio1 {
    
    public static void main(String[] args){        
        
        /*
         Escreva um programa na linguagem Java que contenha duas variáveis
         do tipo double relativas a nota parcial e final de um aluno. Calcule e
         apresente na tela a média final utilizando método println.
        */
        double np = 8.5;
        double nf = 10.0;
        
        double mf = (np*0.40)+(nf*0.60);
        System.out.println("Sua Nota Final é: "+ mf);
        
        //AQUI É USANDO %.1F PARA UMA OU DUAS CASAS DEPOIS DA VIRGULA
        System.out.println(String.format("Média Final: %.1f", mf));
        
    }
}
