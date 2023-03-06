
package Exemplo04;


public class Exercicio02 {
   
    public static void main(String[] args) {
        
        int mat [] [] = new int[10][10];
        
        //preencher matriz numeros aleatorios
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random()*255);
                
            }
            
        }
        
        //Exibir os valores
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+"\t");
                
            }
            System.out.print("\n");
        }
    }
}

