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
public class topic5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner mm = new Scanner(System.in);
        System.out.println("請輸入階層值M:");
        int m = mm.nextInt();
        int x = 1;
        int n = 1;
        while (x < m) {
            x = (n + 1) * x;
            n++;
        }
        System.out.printf("超過Ｍ為%d的最小階層Ｎ值為:", m);
        System.out.println(n);
    }

}
