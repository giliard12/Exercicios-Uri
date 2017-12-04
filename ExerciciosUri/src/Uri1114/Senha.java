/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1114;

/**
 *
 * @author giliard.beda
 */
public class Senha {
    public boolean verificaSenha(int senha){
        if(senha == 2002){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Senha Invalida");
            return false;    
        }
        
    }
}
