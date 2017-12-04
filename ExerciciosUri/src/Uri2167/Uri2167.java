/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2167;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class Uri2167 {
    public static void run(){
        int i, caso=0;
        falhaDoMotor motor = new falhaDoMotor();
        Scanner input = new Scanner(System.in);
        int medidasVelocidade; //1<N<=100
        boolean continuar = true;
        
        do{
            medidasVelocidade = input.nextInt();
            int[] rotacoesMinutos = new int[medidasVelocidade];
            if ((medidasVelocidade>1) && (medidasVelocidade<=101)){
                for(i=0;i<rotacoesMinutos.length;i++){
                    rotacoesMinutos[i] = input.nextInt();
                    continuar = false;             
                }
                caso = motor.falha(rotacoesMinutos);
            } else {
                System.out.println("Digite um número maior de 1 e menor de 100.");
            }
        }while(continuar);  
     
    }
}
