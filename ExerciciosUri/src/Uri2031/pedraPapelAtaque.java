/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2031;

/**
 *
 * @author giliard.beda
 */
public class pedraPapelAtaque {
    public int verificarVencedor(String[] sinal) {
        String[] forma = {"pedra", "papel", "ataque"};
        int jogador1, jogador2;
        if (sinal[0].equals(forma[0])) { //se sinal1 for pedra    
            jogador1 = 1;
        } else if (sinal[0].equals(forma[1])) { //se sinal1 for papel    
            jogador1 = 2;
        } else { //se sinal1 for ataque    
            jogador1 = 3;
        } 
        
         if (sinal[1].equals(forma[0])) { //se sinal2 for pedra    
            jogador2 = 1;
        } else if (sinal[1].equals(forma[1])) { //se sinal2 for papel    
            jogador2 = 2;
        } else { //se sinal2 for ataque    
            jogador2 = 3;
        } 
        
        if(jogador1 == 3 && jogador2 != 3){// Ataque ganha de todos, "Jogador 1 venceu"
            return 1;
        } else if(jogador2 == 3 && jogador1 != 3){ //ataque ganha de todos, "Jogador 2 venceu"
            return 2;
        } else if(jogador2 == 3 && jogador1 == 3){ //ataque com ataque, "Aniquilação Mútua"
            return 5;
        } else if(jogador1 == 1 && jogador2 == 1){ //pedra com pedra, "Sem ganhador"
            return 3;
        } else if(jogador1 == 2 && jogador2 == 2){//papel com papel, "Ambos ganham"
            return 4;
        } else if(jogador1 == 1 && jogador2 == 2){//pedra com papel, "Jogador 1 venceu"
            return 1;
        } else {
        return 2; //papel com pedra, "Jogador 2 venceu"
        }  
    }
    
    public void imprimirVencedor(int vencedor){
        
        switch (vencedor) {
            case 1:
                System.out.print("Jogador 1 venceu");
                break;
            case 2:
                System.out.print("Jogador 2 venceu");
                break;
            case 3:
                System.out.print("Sem ganhador");
                break;
            case 4:
                System.out.print("Ambos venceram");
                break;
            case 5:
                System.out.print("Aniquilação Mútua");
                break;
           }
       }
        
    }

