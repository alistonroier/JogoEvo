
package jogoevo;

import java.util.Random;
import java.util.Scanner;


public class personagemAleatorio {
    Scanner entrada = new Scanner(System.in);
    personagemCooperante personagemCoop = new personagemCooperante();
    
    int jogadas = 0;
    int totalMoedas = personagemCoop.estrategiaCooperante();//Chama o primeiro personagem junto com a quantidade de moedas do jogador 
    
    public int jogadasAleatorias(){ //Escolhe quantidade de partidas entre 5 e 7 
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(5);
        int jogadas = valor + 3;
    return jogadas;
    }
    
    public int jogadasMoedasAleatorio(){//Personagem aleatorio precisa de jogas aleatorias
        Random aleatorioM = new Random();
        int jogadasMoedas = aleatorioM.nextInt(2);
    return jogadasMoedas;
    }
    
    public int estrategiaAleatorio(){
        int i = 0;
        int moedasUsuario = 0;
        int moedasAdversario = 0;
   
        while(i<jogadasAleatorias()){//while com quantidade de jogas gerada
        System.out.println("OPONENTE: 2 DE 2\n1 - ENGANAÇÃO \n2 - COLABORAR");
        int opcaoMoeda = entrada.nextInt();
        
           if(opcaoMoeda < 1 ||opcaoMoeda > 2){//verifica se o jogador escolheu certo
                System.out.println("Opção incorreta\n");

            }else if(opcaoMoeda == 1){ //Se o jogador ENGANAR acontece isso

                if(jogadasMoedasAleatorio() == 1){//se o aleatorio ENGANAR acontece isso
                    System.out.println("\n0 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("Outro jogador ENGANOU");
                    System.out.println("0 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS\n");
                    System.out.println("\nSUA PONTUAÇÃO TOTAL:"+totalMoedas);
                    i++;
                    
                }else{//caso contrário o aleatorio vai COOPERAR
                    moedasUsuario = moedasUsuario + 3;//ajusta as quantidades das moedas da partida
                    moedasAdversario--;//ajusta as quantidades das moedas da partida

                    System.out.println("\n+ 3 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("Outro jogador COOPEROU");
                    System.out.println("- 1 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS\n");
                    totalMoedas = totalMoedas + 3;//Conta a quantidade de moedas totais do jogo
                    System.out.println("\nSUA PONTUAÇÃO TOTAL:"+totalMoedas);
                    i++;
                }
            }else{//se o jogador COOPERAR acontece isso

                if(jogadasMoedasAleatorio() == 1){//se o aleatorio ENGANAR acontece isso
                    moedasUsuario--;//ajusta as quantidades das moedas da partida
                    moedasAdversario = moedasAdversario + 3;//ajusta as quantidades das moedas da partida

                    System.out.println("\n- 1 MOEDA para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("Outro jogador ENGANOU");
                    System.out.println("+ 3 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS\n");
                    totalMoedas--;//Conta a quantidade de moedas totais do jogo
                    System.out.println("\nSUA PONTUAÇÃO TOTAL:"+totalMoedas);
                    i++;
                    
                }else{//caso contrário o aleatorio vai COOPERAR
                    moedasUsuario = moedasUsuario + 2;//ajusta as quantidades das moedas da partida
                    moedasAdversario = moedasAdversario + 2;//ajusta as quantidades das moedas da partida

                    System.out.println("\n+ 2 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("Outro jogador COOPEROU");
                    System.out.println("+ 2 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS\n");
                    totalMoedas = totalMoedas + 2;//Conta a quantidade de moedas totais do jogo
                    System.out.println("\nSUA PONTUAÇÃO TOTAL:"+totalMoedas);
                    i++;
                }
            }
        } 
    return totalMoedas;
    }

}
    

