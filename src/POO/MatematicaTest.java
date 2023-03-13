
package POO;


public class MatematicaTest {
    
    public static void main(String[] args) {
        
        Matematica n1 = new Matematica();
        n1.Num = 25;
        
        System.out.println("Raiz Quadrada: " + n1.RaizQuadrada());
        
        System.out.println("Quadrada: " + n1.Quadrado());
        
        System.out.println("Cubo: " + n1.Cubo());
    }
    
}
