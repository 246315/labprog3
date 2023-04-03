
package Abstratos;


public class FormaTest {
    
    public static void main(String[] args) {
        
        Forma f[] = new Forma[4];
        
        f[0] = new Triangulo(2,4);
        f[1] = new Circulo(5);
        f[2] = new Quadrado(10);
        f[3] = new Cilindro(5,2);
        
        for(Forma i : f){
            System.out.println(i);
        }
    }
}
