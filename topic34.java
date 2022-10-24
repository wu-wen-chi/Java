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
public class topic34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner nn=new Scanner(System.in);
        System.out.println("輸入一正整數:");
        int n=nn.nextInt();
        if(n%2==0 && n%11==0 && n%5!=0 && n%7!=0){
            System.out.println(n+"為新公倍數?:Yes");
        }else{
            System.out.println(n+"不為新公倍數");
        }
    }
    
}
