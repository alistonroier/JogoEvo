
package jogoevo;

import java.util.Scanner;


public class cenario {
 
    public int selecionaPersonagem(){
        Scanner entrada = new Scanner(System.in);     
        int idPersonagem = 0;
        while(true){

            System.out.println("Selecione o seu personagem: \n 1 - COOPERANTE \n 2 - ALEATORIO");
             int personagemUsuario = entrada.nextInt();
             if (personagemUsuario < 1 || personagemUsuario > 2 ){
                System.out.println("Opção incorreta\n");
                }else if(personagemUsuario == 1){
                    System.out.println("\nVocê sera o Cooperante e seu adversário o Aleatório");
                    idPersonagem = personagemUsuario;
                    break;
                }else{
                    System.out.println("\nVocê sera o Aleatório e seu adversário o Cooperante");
                    idPersonagem = personagemUsuario;
                    break;
                  }
         } 
    return idPersonagem;
    }
    
    
    
}
