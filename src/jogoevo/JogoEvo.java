
package jogoevo;

import java.util.Scanner;
import java.util.Random;


public class JogoEvo {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);     
        int adversarioEscolhido = 0;  
        int jogadas = 0;
        cenario inijogo = new cenario();

        //recebe o personagem adversário escolhido
        adversarioEscolhido = inijogo.selecionaPersonagem();

        // gera a quantidades de jogadas
        jogadas = inijogo.jogadasAleatorias();

        
        // se o adversário for o cooperante
        int i = 0;
        int moedasUsuario = 0;
        int moedasAdversario = 0;

        while(i<jogadas){
        System.out.println("1 - para COLABORAR \n2 - para ENGANAÇÃO");
        int opcaoMoeda = entrada.nextInt();
        //falta um if() para verificar quem é o adversario e suas caracteristicas
            if(opcaoMoeda < 1 ||opcaoMoeda > 2){
                System.out.println("Opção incorreta\n");//retorna pra colocar 1 ou 2
                }else if(opcaoMoeda == 1){
                    //se o jogador colocar moeda acontece isso 
                    moedasUsuario = moedasUsuario + 2;
                    moedasAdversario = moedasAdversario + 2;
                    System.out.println("+ 2 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("+ 2 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS");
                    i++;
                }else{
                    //se o jogador enganar acontece isso
                    moedasUsuario = moedasUsuario + 3;
                    moedasAdversario--;
                    System.out.println("+ 3 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("- 1 MOEDA para o adversário = "+moedasAdversario+" MOEDAS");
                    i++;
                }
        }      
    }
}