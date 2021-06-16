
package jogoevo;

public class JogoEvo {
    
    public static void main(String[] args) {
        cenario inijogo = new cenario();//Chamando a classe cenario
        inijogo.introducao(); //texto de introdução do game
      
        personagemAleatorio personagemAle = new personagemAleatorio();//Chamando a classe do personagem ALETAROIO
        personagemAle.estrategiaAleatorio();//Jogo com os dois personagens em sequência
    }
}