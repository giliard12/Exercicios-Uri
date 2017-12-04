/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Uri1042.Uri1042;
import Uri1045.Uri1045;
import Uri1114.Uri1114;
import Uri1142.Uri1142;
import Uri1151.Uri1151;
import Uri1789.Uri1789;
import Uri1960.Uri1960;
import Uri2031.Uri2031;
import Uri2167.Uri2167;
import Uri2582.Uri2582;

/**
 *
 * @author felipe.reblin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        switch (args[0]) {
            case "1042":
                Uri1042.run();
                break;
            case "1142":
                Uri1142.run();
                break;
            case "1151":
                Uri1151.run();
                break;
            case "1114":
                Uri1114.run();
                break;
            case "1045":
                Uri1045.run();
                break;
            case "1789":
                Uri1789.run();
                break;
            case "1960":
                Uri1960.run();
                break;
            case "2031":
                Uri2031.run();
                break;
            case "2167":
                Uri2167.run();
                break;
            case "2582":
                Uri2582.run();
                break;                  
        }
        
        
        
    }
    
}
