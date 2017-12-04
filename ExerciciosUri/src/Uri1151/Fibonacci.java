/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1151;

/**
 *
 * @author giliard.beda
 */
public class Fibonacci {
     public String gerarFibonacci(int numero){
         String sequencia = null;
        int n1 = 1, n2 = 0;
        sequencia =+ n2 + " ";
        sequencia =+ n1 + " ";
        
            for(int j = 0; j < (numero-2); j++){
                n1 = n1 + n2;
                n2 = n1 - n2;
                sequencia =+ n1 + " ";
            }
            return sequencia;
    }
}
