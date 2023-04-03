
package Abstratos;

public abstract class Forma {
    /*
        METODOS ABSTRATOS
    */
    public abstract String getNome();
    public abstract double getArea();
    
    @Override
    public String toString()
    {
        return "\nForma: "+ getNome()+
                "\nÁrea: "+ getArea();
    }
}
