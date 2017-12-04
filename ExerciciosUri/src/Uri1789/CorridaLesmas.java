/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1789;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class CorridaLesmas {
    public int[] cadastrarLesmas(int quantidade){
        int i;
        int[] lesmas = new int[quantidade];
         Scanner input = new Scanner(System.in);    
        for(i=0;i<quantidade;i++){
            System.out.println("Digite a velocidadeda lesma "+ (i+1) + ":");
            lesmas[i]= input.nextInt();
        }
        return lesmas;
    }
    
    public int verificarVelocidades(int[] lesmas){
        int velocidade=0,i;
        for(i=0;i<lesmas.length;i++){
            if(lesmas[i]>velocidade){
                velocidade=lesmas[i];
            }
        }
        
        return getRank(velocidade);
    }
    
    public int getRank(int velocidade){
        if (velocidade<10){
            return 1;
        }else if(velocidade>=10&&velocidade<20){
            return 2;
        }else{
            return 3;
        }
    }
}
