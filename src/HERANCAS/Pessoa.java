
package HERANCAS;

public class Pessoa {
    
    private String Nome;
    private String Endereco;
    private String Email;

    public Pessoa() {
    }

    public Pessoa(String Nome, String Endereco, String Email) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + 
                "\nEndereço: " + getEndereco()+
                "\nEmail: "+ getEmail();
    }
    
    
}
