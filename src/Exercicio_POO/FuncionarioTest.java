
package Exercicio_POO;

/**
 *
 * @author 830015
 */
public class FuncionarioTest {
    
    public static void main(String[] args) {
        
        Funcionario Joao = new Funcionario();
            Joao.setNome("João Victor");
            Joao.setSalario(2000);
            Joao.setAnoContratacao(2009);
            System.out.println(Joao.toString());
        
    }
    
}
