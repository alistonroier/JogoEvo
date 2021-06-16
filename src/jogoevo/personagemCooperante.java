
package jogoevo;

import java.util.Random;
import java.util.Scanner;

public class personagemCooperante {
    Scanner entrada = new Scanner(System.in); 
    int totalMoedas = 0;

    public int jogadasAleatorias(){ //Escolhe quantidade de partidas entre 5 e 7 
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(5);
        int jogadas = valor+3;
    return jogadas;
    }
    
    public int estrategiaCooperante(){
        int i = 0;
        int moedasUsuario = 0;//quantidade de moedas desta partida
        int moedasAdversario = 0;//quantidade de moedas desta partida
        
        while(i<jogadasAleatorias()){//while com quantidade de jogas gerada
            System.out.println("OPONENTE: 1 DE 2\n1 - ENGANAÇÃO \n2 - COLABORAR");
            int opcaoMoeda = entrada.nextInt();

                if(opcaoMoeda < 1 ||opcaoMoeda > 2){//verifica se o jogador escolheu certo
                    System.out.println("Opção incorreta\n");

                    }else if(opcaoMoeda == 1){//se o jogador ENGANAR acontece isso 
                        moedasUsuario = moedasUsuario + 3;//ajusta as quantidades das moedas da partida
                        moedasAdversario--;//ajusta as quantidades das moedas da partida

                        System.out.println("\n+ 3 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                        System.out.println("Outro jogador COOPEROU");
                        System.out.println("- 1 MOEDA para o adversário = "+moedasAdversario+" MOEDAS\n");
                        totalMoedas = moedasUsuario; //Conta a quantidade de moedas totais do jogo
                        System.out.println("\nSUA PONTUAÇÃO TOTAL:"+totalMoedas);
                        i++;

                    }else{//se o jogador COOPERAR acontece isso
                        moedasUsuario = moedasUsuario + 2;//ajusta as quantidades das moedas da partida
                        moedasAdversario = moedasAdversario + 2;//ajusta as quantidades das moedas da partida

                        System.out.println("+ 2 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                        System.out.println("Outro jogador COOPEROU");
                        System.out.println("+ 2 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS\n");
                        totalMoedas = moedasUsuario; //Conta a quantidade de moedas totais do jogo
                        System.out.println("\nSUA PONTUAÇÃO TOTAL:"+totalMoedas);
                        i++;
                    }
        } 
    return totalMoedas;
    }
}
