/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo02;

/**
 *
 * @author 830015
 */
public class Conversor {
    
    public static void main(String[] args){
        
        //Concatenar em String
        String a = "10";
        String b = "20";
        String c = a+b;
        
        System.out.println(c);
        
        //Converter as variáveis para o tipo INT
        
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = x+y;
        System.out.println(z);
        
        //Converter as variáveis para o tipo double
        
        double i = Double.parseDouble(a);
        double j = Double.parseDouble(b);
        double k = i+j;
        System.out.println(k);
        
        //Converte as variáveis númericas para string
        
        String s = String.valueOf(k);
        System.out.println(s);
    }
}
