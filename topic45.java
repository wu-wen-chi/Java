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
public class topic45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner x=new Scanner(System.in);
        System.out.println("輸入月份:");
        int mon=x.nextInt();
        System.out.println("輸入日期:");
        int day=x.nextInt();
        if((mon*2+day)%3 ==0){
            System.out.println("普通");
        }else if((mon*2+day)%3 ==1){
            System.out.println("吉");
        }else{
            System.out.println("大吉");
        }
        
    }
    
}
