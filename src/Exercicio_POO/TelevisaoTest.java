
package Exercicio_POO;

import java.util.HashSet;
import java.util.Set;

public class TelevisaoTest {
    
    public static void main(String[] args) {
        
        
        Televisao t = new Televisao();
        t.setCanal(7);
        t.setVolume(30);
        System.out.println(t.toString());
        
        t.setCanal(0);
        t.setVolume(0);
        
    }
}
