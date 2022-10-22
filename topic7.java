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
public class topic7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入月租費形式及通話時間為:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        switch(x){
            case 186:
                if(y*0.09 <= x){
                    System.out.println("通話費為:186\n");
                }
                else if(y * 0.09 >= x*2){
                    System.out.printf("通話費為:%.0f\n", y * 0.09 * 0.8);
                }
                else{
                    System.out.printf("通話費為:%.0f\n", y * 0.09 * 0.9);
                }
                break;
            case 386:
                if(y*0.08 <= x){
                    System.out.println("通話費為:386\n");
                }
                else if(y * 0.08 > x*2){
                    System.out.printf("通話費為:%.0f\n", y * 0.08 * 0.7);
                }
                else{
                    System.out.printf("通話費為:%.0f\n", y * 0.08 * 0.8);
                }
                break;
            case 586:
                if(y*0.07 <= x){
                    System.out.println("通話費為:586\n");
                }
                else if(y * 0.07 >= x * 2){
                    System.out.printf("通話費為%.0f:\n", y * 0.07 * 0.6);
                }
                else{
                    System.out.printf("通話費為:%.0f\n", y * 0.07 * 0.7);
                }
                break;
            case 986:
                if(y*0.06 <= x){
                    System.out.println("通話費為:986\n");
                }
                else if(y * 0.06 >= x * 2){
                    System.out.printf("通話費為:%.0f\n", y * 0.06 * 0.5);
                }
                else{
                    System.out.printf("通話費為:%.0f\n", y * 0.06 * 0.6);
                }
                break;
        }
    }
}
