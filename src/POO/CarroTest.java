
package POO;

public class CarroTest {
    
    public static void main(String[] args) {
        
        //Criação de um OBJETO  da classe Carro
        
        Carro Fusca = new Carro();
        Fusca.Fabricante = "VM";
        Fusca.Modelo = "Fusca";
        Fusca.Cor = "Verde-Neon";
        Fusca.Ano = 1968;
        
        Fusca.Ligar();
        
        Carro Corcel = new Carro();
        Corcel.Fabricante = "Ford";
        Corcel.Modelo = "Corcel II";
        Corcel.Cor = "Cinza";
        Corcel.Ano = 1982;
        
        Corcel.Ligar();
        
        Carro UNO = new Carro();
        UNO.Fabricante = "Fiat";
        UNO.Modelo = "Uno mille";
        UNO.Cor = "Branco";
        UNO.Ano = 2012;
        UNO.Desligar();
        
        //CRIAÇÃO DE UM VETOR DE OBJETOS  da classe carro
        
        Carro Carros[] = new Carro[3];
        
        Carros[0] = new Carro();
        Carros[0].Fabricante = "Fabricante 1";
        Carros[0].Modelo = "Modelo 1";
        
        Carros[1] = new Carro();
        Carros[1].Fabricante = "Fabricante 2";
        Carros[1].Modelo = "Modelo 2";
        
        Carros[2] = new Carro();
        Carros[2].Fabricante = "Fabricante 3";
        Carros[2].Modelo = "Modelo 3";
        
        //dois modos de se fazer
        for(Carro c : Carros)
        {
            System.out.println("Fabricante: " + c.Fabricante);
            System.out.println("Fabricante: " + c.Modelo);
        }
        /*
        for (int i = 0; i < Carros.length; i++)
        {
            Carro c = Carros[i];
            System.out.println("Fabricante: " + c.Fabricante);
            System.out.println("Fabricante: " + c.Modelo);
            
        }*/
        
    }
}
