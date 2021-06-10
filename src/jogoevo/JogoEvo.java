
package jogoevo;

import java.util.Scanner;
import java.util.Random;


public class JogoEvo {

   
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);  
        
        cenario inijogo = new cenario();
        personagemCooperante personagemCoo = new personagemCooperante();
        
        System.out.println(inijogo.introducao()); //tex de introdução do game

        //recebe o personagem adversário escolhido
        //adversarioEscolhido = inijogo.selecionaPersonagem(); //caso precise escolher o personagem (class cenario)

        // Primeiro adversário o cooperante
        personagemCoo.estrategiaCooperante();
             
    }
}