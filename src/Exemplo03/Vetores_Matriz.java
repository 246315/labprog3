
package Exemplo03;


public class Vetores_Matriz {
   
    public static void main(String[] args) {
        
        int mat [] [] = new int[3][4];
        
        //preencher matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random()*10);
                
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
