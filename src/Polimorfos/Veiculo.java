
package Polimorfos;


public class Veiculo {
    
    protected String Marca;
    private int Ano;
    //PROTECTED A VISIBILIDADE DEFINIDA COMO PROTEGIDA PERMITE QUE
    //O ATRIBUTO OU MÉTODO SEJA ACESSADO PELA PROPRIA CLASSE E PELAS CLASSES
    //DERIVADAS
    protected double Velocidade;
    
    /* POLIMORFISMO POR SOBRECARGA*/

    public Veiculo() {
    }

    public Veiculo(String Marca, int Ano, double Velocidade) {
        this.Marca = Marca;
        this.Ano = Ano;
        this.Velocidade = Velocidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double Velocidade) {
        this.Velocidade = Velocidade;
    }

    @Override
    public String toString() {
        return "\nMarca: " + getMarca() +
                "\nAno: " + getAno() +
                "\nVelocidade: " + getVelocidade();
    }
    
    
    
}
