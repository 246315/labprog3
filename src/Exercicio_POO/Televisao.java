
package Exercicio_POO;

/**
 *
 * @author 830015
 */
public class Televisao {

    private int Canal;
    private int Volume;
    
    public Televisao()
    {
        this.Canal =1;
        this.Volume =0;
    }

    public Televisao(int Canal, int Volume) {
        this.Canal = Canal;
        this.Volume = Volume;
    }
    

    public void setCanal(int canal){
        if(canal >=1 && canal <=999 )    
            this.Canal=canal;
        else
        {
            System.out.println("Canal não encontrado");
        }
    }
    
    public void setVolume(int Vol)
    {
        if(Vol >= 0 )
            this.Volume= Vol;
        else
        {
            System.out.println("Volume está no mudo....");
        }
    }
    
    public int getCanal(int canal)
    {
        return this.Canal;
    }
    
    public int getVolume()
    {
        return this.Volume;
    }
    
    public void AumentarVolume()
    {
        setVolume(getVolume()+1);
    }
    
    public void ReduzirVolume()
    {
        setVolume(getVolume()-1);
    }
}
