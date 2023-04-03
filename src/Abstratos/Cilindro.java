
package Abstratos;


public class Cilindro extends Forma{
     private double Raio;
    private double Altura;

    public Cilindro() {
    }

    public Cilindro(double raio, double altura) {
        this.Raio = raio;
        this.Altura = altura;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        this.Raio = raio;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        this.Altura = altura;
    }
    
    @Override
    public String getNome() {
        return "Cilindro";
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRaio()*(getRaio()+getAltura());
    }  
}
