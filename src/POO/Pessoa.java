
package POO;


public class Pessoa {
    
    public String Nome;
    public double Peso;
    public double Altura;
    
    public double IMC()
    {
        return (Peso/Math.pow(Altura, 2));
    }
    
    public void Bom()
    {
        
        System.out.println("Seu IMC está normal...");
    }
    
    public void Ruim()
    {
        System.out.println("Seu IMC está ruim praticar mais exercicios...");
    }
    
}
