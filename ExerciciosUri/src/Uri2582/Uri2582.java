/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2582;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class Uri2582 {
    public static void run(){
        EscolhaDasMusicas musica = new EscolhaDasMusicas();
         String musicaEscolhida = "";
        int[] botoes = new int [2];
        Scanner input = new Scanner(System.in);
      
          int qntd = musica.lerQuantidade();
         int cont=0;
         for(int l=0; l<qntd; l++){
             for(int j=0;j<2;j++){
                System.out.println("Digite o " + (j+1) + " botão");
                botoes[j] = input.nextInt();
                musicaEscolhida = musica.verificarMusica(botoes);
            }
        }
        System.out.println(musicaEscolhida);
    }
}
