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
public class Uri1142 {
    public static void run() {
        Pum pum = new Pum();
    
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        System.out.println(pum.gerarSequencia(numero));
    }    
}

