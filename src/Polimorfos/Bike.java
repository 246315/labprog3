
package Polimorfos;


public class Bike extends Veiculo{
    
    private int Aro;
    private boolean Eletrica;

    public Bike() {
        super();
    }

    public Bike(int Aro, boolean Eletrica, String Marca, int Ano, double Velocidade) {
        super(Marca, Ano, Velocidade);
        this.Aro = Aro;
        this.Eletrica = Eletrica;
    }

    public int getAro() {
        return Aro;
    }

    public void setAro(int Aro) {
        this.Aro = Aro;
    }

    public boolean isEletrica() {
        return Eletrica;
    }

    public void setEletrica(boolean Eletrica) {
        this.Eletrica = Eletrica;
    }

    @Override
    public String getMarca()
    {
        return super.Marca + " (Bike)";
    }
    
    @Override
    public String toString() {
        return "\n\nAro: " + getAro() + 
                "\nEletrica: " + (isEletrica()?"SIM":"NÃO");
    }
    
    
    
    
}
