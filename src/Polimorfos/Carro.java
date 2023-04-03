
package Polimorfos;


public class Carro  extends Veiculo{
    
    private int NumeroPortas;
    private boolean ArCondicionado;

    public Carro() {
        super();
    }
    
    public Carro(String Marca, int Ano, double Velocidade,
                int NumeroPortas, boolean ArCondicionado){
        super(Marca, Ano, Velocidade);
        this.NumeroPortas = NumeroPortas;
        this.ArCondicionado = ArCondicionado;
    }

    public int getNumeroPortas() {
        return NumeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.NumeroPortas = numeroPortas;
    }

    public boolean isArCondicionado() {
        return ArCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.ArCondicionado = arCondicionado;
    }
    
    public boolean VelocidadeMaxima()
    {
        /*
            O ATRIBUTO VELOCIDADE PODE SER ACESSADO NA CLASSE CARRO, POIS FOI
            DEFINIDO COMO PROTECTED NA CLASSE VEICULO
        */
        if(Velocidade >= 180)
        {
            return true;
        }
        else
        {
            return false;
        }
        //OU SIMPLICADO 
        //return (Velocidade >=300);
    }
    //POLIMORFISMO POR SOBREPOSIÇÃO
    @Override
    public String getMarca()
    {
        return super.Marca + " (Carro)";
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nNúm.Portas: " + getNumeroPortas() +
            "\nAr-Condicionado: " + (isArCondicionado() ? "SIM" : "NÃO");
    }
}
