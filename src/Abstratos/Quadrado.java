
package Abstratos;


public class Quadrado extends Forma{
     private double Lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.Lado = lado;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        this.Lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return getLado()*getLado();
    }
    
}
