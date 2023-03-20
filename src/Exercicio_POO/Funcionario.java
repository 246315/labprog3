
package Exercicio_POO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class Funcionario {
  
    private String Nome;
    private double Salario;
    private int AnoContratacao;

    public Funcionario() {
    }

    public Funcionario(String Nome, double Salario, int AnoContratacao) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.AnoContratacao = AnoContratacao;
    }
    
    
    //para gerar automatico Alt+Insert
    public void setNome(String nome)
    {
        this.Nome=nome;
    }
    
    public void setSalario(double salario)
    {
        this.Salario=salario;
    }
    
    public void setAnoContratacao(int AnoContrata)
    {
        this.AnoContratacao=AnoContrata;
    }
    
    public String getNome()
    {
        return this.Nome;
    }
    
    public double getSalario()
    {
        return this.Salario;
    }
    
    public int getAnoContratacao()
    {
        return this.AnoContratacao;
    }
    
    public double getBonificacao()
    {
        int Tempo =
            LocalDate.now().getYear()-AnoContratacao;
        if(Tempo > 5 && Tempo <=10)
        {
            return 0.05;
        }
        else if(Tempo > 10 && Tempo <=20)
        {
            return 0.10;
        }
        else if(Tempo > 20)
        {
            return 0.20;
        }
        else
        {
            return 0.00;
        }
    }
    
    public double getSalarioTotal()
    {
        return getSalario()+(getSalario()*getBonificacao());
    }
    
    @Override
    public String toString()
    {
        return "Nome: "+ getNome()+
                String.format("\nSalário: R$ %.2f", getSalario())+
                "\nAno contratação: " + getAnoContratacao() +
                String.format("\nBonificação: %.1f%%", getBonificacao()*100) +
                String.format("\nSalário Total: %.2f", getSalarioTotal());
    }
}
