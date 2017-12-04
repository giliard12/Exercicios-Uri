/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1042;

import java.util.Scanner;

/**
 *
 * @author giliard.beda
 */
public class Uri1042 {
    public static void run() {
        ArraySort arraySort = new ArraySort();
        int[] sortNumbers, unsortNumbers;
        
        Scanner input = new Scanner(System.in);
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        int i3 = input.nextInt();
        
        sortNumbers = arraySort.sortArray(i1, i2, i3);
        for(int num : sortNumbers){
            System.out.println(num);
        }
        System.out.println();
        
        unsortNumbers = arraySort.unsortArray(i1, i2, i3);
        for(int num : unsortNumbers){
            System.out.println(num);
        }
    }
}

