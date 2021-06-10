
package jogoevo;

import java.util.Random;
import java.util.Scanner;


public class cenario {
 
    public int selecionaPersonagem(){
        Scanner entrada = new Scanner(System.in);     
        int idPersonagem = 0;
        while(true){

            System.out.println("Selecione o seu adversário: \n 1 - COOPERANTE \n 2 - ALEATORIO");
             int personagemAdversario = entrada.nextInt();
             if (personagemAdversario < 1 || personagemAdversario > 2 ){
                System.out.println("Opção incorreta\n");
                }else if(personagemAdversario == 1){
                    System.out.println("\nSeu adversário será o Cooperante");
                    idPersonagem = personagemAdversario;
                    break;
                }else{
                    System.out.println("\nSeu adversário será o Aleatório");
                    idPersonagem = personagemAdversario;
                    break;
                  }
         } 
    return idPersonagem;
    }
    
    public int jogadasAleatorias(){ 
        int jogadas = 0;
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(5);
        jogadas = valor+3;
        System.out.println(jogadas);
    return jogadas;
    }  
}
