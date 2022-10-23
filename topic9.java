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
public class topic9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a=new Scanner(System.in);
        System.out.println("輸入s1為:");
        Scanner b=new Scanner(System.in);
        System.out.println("輸入s2為:");
        String s1=a.next();
        String s2=b.next();
        if(s2.contains(s1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
