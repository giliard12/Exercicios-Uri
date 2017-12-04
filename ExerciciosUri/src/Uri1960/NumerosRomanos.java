/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1960;

/**
 *
 * @author giliard.beda
 */
public class NumerosRomanos {
     public String getRomanos(String numeroS){
        String mm[] = {"M","MM","MMM"};
        String cc[] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String dd[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String uu[] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String resposta="";
        
        char num[] = numeroS.toCharArray();
        if(num.length==4){
            int num0=num[0]-48;
            int num1=num[1]-48;
            int num2=num[2]-48;
            int num3=num[3]-48;
            
            resposta=resposta+mm[num0-1];
            resposta=resposta+cc[num1-1];
            resposta=resposta+dd[num2-1];
            resposta=resposta+uu[num3-1];
        }
        if(num.length==3){
            int num0=num[0]-48;
            int num1=num[1]-48;
            int num2=num[2]-48;
            
            resposta=resposta+cc[num0-1];
            resposta=resposta+dd[num1-1];
            resposta=resposta+uu[num2-1];
        }
        if(num.length==2){
            int num0=num[0]-48;
            int num1=num[1]-48;
            
            resposta=resposta+dd[num0-1];
            resposta=resposta+uu[num1-1];
        }
        if(num.length==1){
            int num0=num[0]-48;
            resposta=resposta+uu[num0-1];
        }
        
        return resposta;
    } 
}
