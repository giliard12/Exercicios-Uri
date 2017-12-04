/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class Pum {
        public String gerarSequencia(int numero){
            StringBuilder builder = new StringBuilder();
            int cont = 0;
            for(int j = 1; j <= (numero * 4); j++){
                builder.append(j+" ");
                //System.out.print(j+" ");
                cont++;
                if(cont == 3){
                    j++;
                    builder.append("PUM\n");
                    cont = 0;
                }
            }
            return builder.toString();
        }
}
