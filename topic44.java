/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtern1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class topic44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner t=new Scanner(System.in);
        System.out.println("輸入班級數:(1<=T<=10)");
        int amount=t.nextInt();
        int max=0;
        ArrayList<Integer> pli=new ArrayList<Integer>();
        for(int i=0;i<amount;i++){
            System.out.println("輸入每班人數:");
            int people=t.nextInt();
            pli.add(people);
            for(int j=0;j<amount;j++){
                if(pli.get(i)>max){
                    max=pli.get(i);
                }
            }
        }
        System.out.println("須購買的電腦數量"+max);
    }
    
}
