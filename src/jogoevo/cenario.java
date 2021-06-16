
package jogoevo;

import java.util.Scanner;

public class cenario {
    Scanner entrada = new Scanner(System.in);
   
    public String introducao(){//Apresenta a mesma introdução do Jogo
        String mensagem;
        mensagem = "Agora, vamos jogar para valer. Você vai jogar contra 2 oponentes\ndiferentes, cada um com sua própria \"estratégia\" de jogo. Com cada\noponente, você jogará em qualquer lugar entre 3 a 7 rodadas. (Você não\nsaberá com antecedência quando será a última rodada) Você pode confiar neles?\nOu melhor ... eles podem confiar em você? \n";
        System.out.println(mensagem);
    return mensagem;
    } 
}