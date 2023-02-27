package Exemplo02;

import java.util.Scanner;


public class ComandosDeEntrada {
    
    public static void main(String[] args) {
        
        //Entrada de dados
        Scanner Entrada = new Scanner(System.in);
        
        System.out.print("Informe o primeiro valor: ");
        int valor1 = Entrada.nextInt();
        //double valor1 = Entrada.nextDouble();
        
        System.out.print("Informe o segundo valor: ");
        int valor2 = Entrada.nextInt();
        //double valor2 = Entrada.nextDouble();
        
        System.out.println("Soma= " + (valor1+valor2));
        
           
    }
}
