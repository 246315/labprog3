
package Polimorfos;

public class Moto extends Veiculo{
    
    private String Categoria;
    private double Cilindradas;

    public Moto() {
        super();
    }

    public Moto(String Marca, int Ano, double Velocidade,String Categoria, double Cilindradas) {
        super(Marca, Ano, Velocidade);
        this.Categoria = Categoria;
        this.Cilindradas = Cilindradas;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getCilindradas() {
        return Cilindradas;
    }

    public void setCilindradas(double Cilindradas) {
        this.Cilindradas = Cilindradas;
    }
    
    @Override
    public String getMarca()
    {
        return super.Marca + " (Moto)";
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nCategoria: " + getCategoria() +
                "\nCilindradas: " + getCilindradas();
    }
    
    
}
