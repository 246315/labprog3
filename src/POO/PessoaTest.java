
package POO;

public class PessoaTest {
    
    public static void main(String[] args) {
        
       /* Pessoa Joao = new Pessoa();
        Joao.Nome = "João Victor";
        Joao.Peso = 85.5;
        Joao.Altura = 1.85;
        
        Pessoa Alyne = new Pessoa();
        Alyne.Nome = "Alyne";
        Alyne.Peso = 75.5;
        Alyne.Altura = 1.70;*/
        
        Pessoa pessoas[] = new Pessoa[2];
        
        pessoas[0] = new Pessoa();
        pessoas[0].Nome = "João Victor";
        pessoas[0].Peso = 85.5;
        pessoas[0].Altura= 1.85;
        
        pessoas[1] = new Pessoa();
        pessoas[1].Nome = "Alyne";
        pessoas[1].Peso = 75.5;
        pessoas[1].Altura= 1.70;
        
        
        for(Pessoa p : pessoas)
        {
            System.out.println("Nome: " + p.Nome);
            System.out.println("Peso: " + p.Peso);
            System.out.println("Altura: " + p.Altura);
            System.out.println(String.format("IMC: %.2f", p.IMC()));
            System.out.println("\n");
        }

    }
}
