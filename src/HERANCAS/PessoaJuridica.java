
package HERANCAS;


public class PessoaJuridica extends Pessoa{
    
    private String CNPJ;
    
    public PessoaJuridica()
    {
        
    }

    public PessoaJuridica(String Nome, String Endereco, String Email, String CNPJ)
    {
        super(Nome, Endereco, Email);
        this.CNPJ=CNPJ;
    }
    

    public PessoaJuridica(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        
        return super.toString()+
                "\nCNPJ: " + getCNPJ();
    }
    
}
