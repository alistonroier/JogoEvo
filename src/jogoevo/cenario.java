
package jogoevo;

import java.util.Random;
import java.util.Scanner;


public class cenario {
    
    public String introducao(){
        String mensagem;
        mensagem = "Agora, vamos jogar para valer. Você vai jogar contra 2 oponentes\ndiferentes, cada um com sua própria \"estratégia\" de jogo. Com cada\noponente, você jogará em qualquer lugar entre 3 a 7 rodadas. (Você não\nsaberá com antecedência quando será a última rodada) Você pode confiar neles?\nOu melhor ... eles podem confiar em você? \n";
    return mensagem;
    }
 
    
    /* se caso precisar escolher o adversário o bloco está aqui
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
    }*/
    
    //Gera a quantidade de jogadas para a partida
    public int jogadasAleatorias(){ 
        int jogadas = 0;
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(5);
        jogadas = valor+3;
      //  System.out.println("Partida com "+jogadas + " jogadas");
    return jogadas;
    }
    
  /*  public String cabecalho(){
        System.out.println("OPONENTE: 1 DE 2");
        System.out.println("SUA PONTUAÇÃO TOTAL:"+totalMoedas.main(totalMoedas));
        System.out.println("1 - ENGANAÇÃO \n2 - COLABORAR");    
    }*/
    
}
