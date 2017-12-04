/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1045;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class Uri1045 {
    public static void run() {
      DefinirTriangulo define = new DefinirTriangulo();
      Scanner input = new Scanner(System.in);    
      float a = input.nextFloat();
      float b = input.nextFloat();
      float c = input.nextFloat();
      String triangulo = define.verifica(a, b, c);
    }
}
