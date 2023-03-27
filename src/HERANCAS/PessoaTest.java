
package HERANCAS;

/**
 *
 * @author 830015
 */
public class PessoaTest {
    
    public static void main(String[] args) {
        //eu consigo pegar as informações do filho mas nn consigo pegar as informações do filho para o pai
        Pessoa p1 = new Pessoa();
        p1.setNome("João Victor");
        p1.setEndereco("Rua São Paulo, 295");
        p1.setEmail("jv@hotmail.com");
        System.out.println(p1);
        
        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Ana Maria");
        p2.setEndereco("Rua ali minas, 456");
        p2.setEmail("Ana.Maria@gmail.com");
        p2.setCPF("123.456.789-05");
        p2.setCNH("A/B");
        System.out.println(p2);
        
        PessoaFisica p3 = new PessoaFisica(
                "José Antônio",
                "Rua BH, 1965",
                "jose@gmail.com",
                "123.456.789-05",
                "A/B"
        );
        System.out.println(p3);
        
        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Geovani");
        p4.setEndereco("Rua Jorgi, 195");
        p4.setEmail("Geovani@gmail.com");
        p4.setCNPJ("46.123.456/0001-95");
        
        System.out.println(p4);
    }
}
