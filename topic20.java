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
public class topic20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner a=new Scanner(System.in);
        System.out.println("組數為:");
        int team=a.nextInt();
        for(int i=1;i<=team;i++){
            Scanner b=new Scanner(System.in);
            System.out.println("第"+i+"組:");
            int all=b.nextInt();
            int half=b.nextInt();
            System.out.printf("第"+i+"組收費用:%s\n\n",all*250+half*175);
        }
    }
    
}
