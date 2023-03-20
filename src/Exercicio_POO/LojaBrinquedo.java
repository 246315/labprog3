
package Exercicio_POO;

public class LojaBrinquedo {
    
    private String Nome;
    private String Faixaetaria;
    private double Preco;
    
    public LojaBrinquedo() {
    }

    public LojaBrinquedo(String nome) {
        this.Nome = nome;
    }

    public LojaBrinquedo(String nome, double preco) {
        this.Nome = nome;
        this.Preco = preco;
    }

    public LojaBrinquedo(String nome, String faixaetaria, double preco) {
        this.Nome = nome;
        this.Faixaetaria = faixaetaria;
        this.Preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getFaixaetaria() {
        return Faixaetaria;
    }

    public void setFaixaetaria(String faixaetaria) {
        
        switch(faixaetaria){
            case "0 a 2":
                this.Faixaetaria = faixaetaria;
                break;
            case "3 a 5":  
                this.Faixaetaria = faixaetaria;
                break;
            case "6 a 10":  
                this.Faixaetaria = faixaetaria;
                break;
            case "acima de 10":  
                this.Faixaetaria = faixaetaria;
                break;
            default:
                System.err.println("Faixa etária inválida.");
        }
        
        
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    @Override
    public String toString() {
        return "Brinquedo{" + "nome=" + Nome + ", faixaetaria=" + Faixaetaria + ", preco=" + Preco + '}';
    }
}
