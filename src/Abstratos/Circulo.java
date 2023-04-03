
package Abstratos;


public class Circulo extends Forma {
     private double Raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.Raio = raio;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        this.Raio = raio;
    }

    @Override
    public String getNome() {
        return "Círculo";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

}
