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
public class topic13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner xx=new Scanner(System.in);
        System.out.println("輸入一字元為:");
        String x=xx.next();
        String y=new StringBuffer(x).reverse().toString();
        if(x.equals(y)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
