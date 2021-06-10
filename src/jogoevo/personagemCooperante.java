
package jogoevo;

import java.util.Scanner;

public class personagemCooperante {
    cenario inijogo = new cenario();
    Scanner entrada = new Scanner(System.in);     
        
    public int estrategiaCooperante(){
        int i = 0;
        int moedasUsuario = 0;
        int moedasAdversario = 0;
        int totalMoedas = 0;

        while(i<inijogo.jogadasAleatorias()){//while com quantidade de jogas gerada
        System.out.println("\nOPONENTE: 1 DE 2");
        System.out.println("SUA PONTUAÇÃO TOTAL: "+totalMoedas);
        System.out.println("1 - ENGANAÇÃO \n2 - COLABORAR");
        int opcaoMoeda = entrada.nextInt();
            if(opcaoMoeda < 1 ||opcaoMoeda > 2){
                System.out.println("Opção incorreta\n");//retorna pra colocar 1 ou 2
                
                }else if(opcaoMoeda == 1){
                    //se o jogador enganar acontece isso                    
                    moedasUsuario = moedasUsuario + 3;
                    moedasAdversario--;
                    System.out.println("\n+ 3 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("Outro jogador COOPEROU");
                    System.out.println("- 1 MOEDA para o adversário = "+moedasAdversario+" MOEDAS");
                    i++;
                    totalMoedas = moedasUsuario;
                    
                }else{
                    //se o jogador enganar acontece isso
                    moedasUsuario = moedasUsuario + 2;
                    moedasAdversario = moedasAdversario + 2;
                    System.out.println("+ 2 MOEDAS para o jogador = "+moedasUsuario+" MOEDAS");
                    System.out.println("Outro jogador COOPEROU");
                    System.out.println("+ 2 MOEDAS para o adversário = "+moedasAdversario+" MOEDAS");
                    i++;
                    totalMoedas = moedasUsuario;
                }
        } 
    return totalMoedas;
    }
    
}
