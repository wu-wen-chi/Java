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
public class topic22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner x=new Scanner(System.in);
        System.out.println("輸入查詢組數n為:");
        int n=x.nextInt();
        for(int i=0;i<n;i++){
            int account=x.nextInt();
            int passwd=x.nextInt();
            if(account == 123 && passwd == 456){
                System.out.println("9000\n");
            }
            else if(account == 456 && passwd == 789){
                System.out.println("5000\n");
            }
            else if(account == 789 && passwd == 888){
                System.out.println("6000\n");
            }
            else if(account == 336 && passwd == 558){
                System.out.println("10000\n");
            }
            else if(account == 775 && passwd == 666){
                System.out.println("12000\n");
            }
            else if(account == 566 && passwd == 221){
                System.out.println("7000\n");
            }
            else{
                System.out.println("error\n");
            }
        }
    }
    
}
