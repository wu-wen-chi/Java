/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtern1;

import java.util.*;

/**
 *
 * @author User
 */
public class topic49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner a=new Scanner(System.in);
        System.out.println("請輸入英文句子:");
        String set=a.nextLine();
        String[] data=set.split(" ");
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<data.length;i++){
            arr.add(data[i]);
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
    
}
