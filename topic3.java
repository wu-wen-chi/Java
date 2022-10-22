/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtern1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class topic3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("請輸入西元年:");
        int year = Scanner1.nextInt();
        int animal = year % 12 - 4;
        String[] x = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};
        if (animal == 1) {
            System.out.println(x[1]);
        }
        if (animal == 2) {
            System.out.println(x[2]);
        }
        if (animal == 3) {
            System.out.println(x[3]);
        }
        if (animal == 4) {
            System.out.println(x[4]);
        }
        if (animal == 5) {
            System.out.println(x[5]);
        }
        if (animal == 6) {
            System.out.println(x[6]);
        }
        if (animal == 7) {
            System.out.println(x[7]);
        }
        if (animal == 8) {
            System.out.println(x[8]);
        }
        if (animal == 9) {
            System.out.println(x[9]);
        }
        if (animal == 10) {
            System.out.println(x[10]);
        }
        if (animal == 11) {
            System.out.println(x[11]);
        }
    }

}
