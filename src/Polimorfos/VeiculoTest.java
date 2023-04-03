
package Polimorfos;

public class VeiculoTest {
    
    public static void main(String[] args) {  
        
        //Polimorfismo por Generalização
        Veiculo v1 = new Carro("GM",2015,180,4,true);
        System.out.println(v1);
        
        //Coerção (Casting) para Objetos
        if ( ((Carro)v1).VelocidadeMaxima()){
            System.out.println("Velocidade Máxima atingida.");
        }
        
        v1 = new Moto("Honda",2020,100,"Cidade",600);
        System.out.println(v1);
    }
    
}
