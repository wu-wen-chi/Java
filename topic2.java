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
public class topic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double s=0;
        double w=0;
        Scanner Scanner1 = new Scanner(System.in);
        System.out.print("請輸入一個度數(正整數):");
        int x = Scanner1.nextInt();
        for(int i=1;i <= x+1;i++){
            if(i<=120){
                s+=2.10;
                w+=2.10;
            }
            if(i > 120 && i <= 330){
                s+=3.02;
                w+=2.68;
            }
            if(i > 330 && i <= 500){
                s+=4.39;
                w+=3.61;
            }
            if(i > 500 && i <= 700){
                s+=4.97;
                w+=4.01;
            }
            if(i > 700){
                s+=5.63;
                w+=4.50;
            }
        }
        System.out.printf("Summer months:%.2f\n",s);
        System.out.printf("Non-Summer months:%.2f\n",w);
        
    }
    
}
