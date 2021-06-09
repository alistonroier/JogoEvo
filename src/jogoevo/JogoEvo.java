
package jogoevo;

import java.util.Scanner;

public class JogoEvo {

   
    public static void main(String[] args) {

   Scanner entrada = new Scanner(System.in);     
   /* colocar este bloco na classe cenário, verificar o retorno do if*/
    System.out.println("Selecione o seu personagem: \n 1 - COOPERANTE \n 2 - ALEATORIO");
    int personagemUsuario = entrada.nextInt();
    if (personagemUsuario < 1 || personagemUsuario > 2 ){
        System.out.println("Opção incorreta");
        }else if(personagemUsuario == 1){
            System.out.println("Você sera o Cooperante e seu adversário o Aleatório");
        }else{
            System.out.println("Você sera o Aleatório e seu adversário o Cooperante");

        }
    
    }
    
}
