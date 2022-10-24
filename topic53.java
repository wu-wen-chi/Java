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
public class topic53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner nn = new Scanner(System.in);
        System.out.println("輸入n值:\n");
        int n = nn.nextInt();
        Map<String, String> data = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            Scanner aa = new Scanner(System.in);
            System.out.println("請輸入姓名:\n");
            String name = aa.nextLine();
            System.out.println("請輸入電子郵件:\n");
            String mail = aa.nextLine();
            data.put(name, mail);
        }
        Scanner qq = new Scanner(System.in);
        System.out.println("請輸入要查詢電子郵件的姓名:\n");
        String sel = qq.nextLine();
        System.out.println(sel + "電子郵件帳號為:" + data.get(sel));
    }

}
