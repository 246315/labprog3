
package POO;


public class Matematica {
    
    public int Num;
    
    public double RaizQuadrada()
    {
        if(VerificaNum())
        {
            return Math.sqrt(Num);
        }
        else
        {
            return 0;
        }
    }
    
    public int Quadrado()
    {
        if(VerificaNum())
        {
            return (int)Math.pow(Num, 2);
        }
        else
        {
            return 0;
        }
    }
    public int Cubo()
    {
        if(VerificaNum())
        {
            return (int)Math.pow(Num, 3);
        }
        else
        { 
            return 0;
        }
        /*
            OU FAZER 
            return VerificaNum() ?
                (int)Math.pow(Num, 3) : 0;
        */
    }
    
    public boolean VerificaNum()
    {
        if(Num > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        //ou fazer apenas return (Num > 0);
    }
}
