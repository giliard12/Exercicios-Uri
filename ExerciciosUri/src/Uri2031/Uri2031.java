/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2031;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class Uri2031 {
    public static void run(){
        int i;
        int j, vencedor;
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        Scanner input = new Scanner(System.in);
        String[] sinal = new String[2];
        String qntd = input.nextLine();
        int qtd = Integer.parseInt(qntd);
        
        for (i=0;i<qtd;i++){
            for(j=0;j<2;j++){
                sinal[j] = input.nextLine();
            }
            vencedor = jokenpo.verificarVencedor(sinal);
            jokenpo.imprimirVencedor(vencedor);
            System.out.println();
        }
    }
}
