
package Exercicio_POO;


public class PessoaTest {
   
    public static void main(String[] args) {
       /* 
        Pessoa Joao = new Pessoa();
        Joao.setNome( "Joao Victor");
        Joao.setEmail( "jv@email.com");
        
        System.out.println(Joao.toString());*/
       
       Pessoa ana = new Pessoa();
       System.out.println(ana.toString());
       
       Pessoa Jose = new Pessoa(
          "José Antônio",
          "Jose@email.com"
       );
       System.out.println(Jose.toString());
    }
}
