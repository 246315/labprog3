
package Exercicio_POO;

/**
 *
 * @author 830015
 */
public class Pessoa {
   private String Nome;
   private String Email;
   
   //CONTRUTOR PADÃO
   public Pessoa()
   {
       System.out.println(
               "Construtor padrão da classe pessoa"
       );
       this.Nome = "";
       this.Email = "";
   }
   
   //CONSTRUTOR SOBRECARREGADO
   public Pessoa(String nome, String email)
   {
       setNome(nome);
       setEmail(email);
   }
   
   //Método SET
   //ENVIAR UM DADO PARA O OBJETO
   
   public void setNome(String nome)
   {
       if(nome.length()>=3)
       {
       this.Nome = nome;
       }
       else
       {
           System.err.println(
                "O nome deve ter no minimo três caracteres."
           );
       }
   }
   
   public void setEmail(String email)
   {
       if(email.contains("@"))
       {
           this.Email = email;
       }
       else
       {
           System.err.println(
                   "O formato do email é inválido"
           );
       }
   }
   
   //Método GET
   //RETORNA O DADO DE UM OBJETO
   
   public String getNome()
   {
       return this.Nome;
   }
   public String getEmail()
   {
       return this.Email;
   }
   
   //MÉTODO ToString
   //RETORNA TODOS OS DADOS DO OBJETO
   
   @Override
   public String toString()
   {
       return "Nome: " + this.getNome()+
               "\nEmail: "+ this.getEmail();
   }
}
