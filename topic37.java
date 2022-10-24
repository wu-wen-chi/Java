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
public class topic37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner nn=new Scanner(System.in);
        System.out.println("整數n:");
        int n=nn.nextInt();
        int cycle=1;
        while(n!=1){
            if(n%2==1){
                n=n*3+1;
                cycle++;
                System.out.println(n);
            }else{
                n=n/2;
                cycle++;
                System.out.println(n);
            }
        }
        System.out.printf("cycle length:%s\n",cycle);
    }
    
}
