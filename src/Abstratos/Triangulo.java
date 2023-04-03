
package Abstratos;


public class Triangulo extends Forma{

    private double Base;
    private double Altura;

    public Triangulo() {
    }

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
    
    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    
    @Override
    public String getNome() {
        return "Triangulo";
    }

    @Override
    public double getArea() {
       return (getBase()*getAltura())/2;
    }
    
}
