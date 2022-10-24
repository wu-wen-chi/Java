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
public class topic35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a=new Scanner(System.in);
        System.out.println("sA:");
        Scanner b=new Scanner(System.in);
        System.out.printf("sB:");
        String sA=a.next();
        String sB=b.nextLine();
        if(sB.contains(sA)){
            System.out.println("子字串判斷為:Yes");
        }else{
            System.out.println("子字串判斷為:No");
        }
        
    }
    
}
