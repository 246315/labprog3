
package POO;
/*
    -Faça uma classe que simule o funcionamento de um bomba d'água. A bomba
     possui um atributo booleano chamado "status" e os métodos "Ligar" e
     "Desligar" (ambos sem retorno).
    
    -O método "Ligar" coloca true em "status e o método "Desligar" coloca false
      em status. A bomba deve ficar ligada durante um certo intervalo de tempo
      (em segundos). O tempo dem segundos deve ser recebido pelo método ligar.
    
    -A cada, segundo apresente em tela quantos segundos faltam para a bomba ser
      desligada. Decorrido o tempo, o método desligar é acionado e a bomba desliga.
*/
public class BombaDaAgua {
    
    public boolean status;
    
    public void ligar(int segundos){
        try {
            status = true;
            System.out.println("Bomba ligada.");
            for (int i = 0; i <  segundos; i++) {
                System.out.println("Tempo restante: " + (segundos-i) + " segundos.");
                Thread.sleep(1000);
            }          
            desligar();
        } catch (InterruptedException ex) {
            System.err.println("ERRO");
        }
        
    }
    
    public void desligar(){
        status = false;
        System.out.println("Bomba desligada.");
    }
      
}
