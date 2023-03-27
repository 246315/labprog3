
package HERANCAS;

/*
 A CLASSE PESSOA FISICA HERDA A CLASSE PESSOA
 */
public class PessoaFisica extends Pessoa{
    
    private String CPF;
    private String CNH;
    
    public PessoaFisica()
    {
        
    }
    public PessoaFisica(String Nome, String Endereco, String Email, String CPF, String CNH)
    {
        //chamar o construtor sobrecarregado da classe pai
        super(Nome,Endereco,Email);
        this.CPF = CPF;
        this.CNH = CNH;
        
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    //super.toString realiza a chamada do método to String da classe PAI(Pessoa)
    @Override
    public String toString()
    {
        return
                super.toString()+
                "\nCPF: "+ getCPF()+
                "\nCNH: "+ getCNH();
    }
}
