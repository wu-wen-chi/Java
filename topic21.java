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
public class topic21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        String[][] li = new String[0][3];
        String li[][] = {{"123", "Tom", "DTGD"}, {"456", "Cat", "CSIE"}, {"789", "Nana", "ASIE"}, {"321", "Lim", "DBA"}, {"654", "Won", "FDD"}};
        Scanner x = new Scanner(System.in);
        System.out.println("輸入查詢學號為:");
        String sid = x.nextLine();
        switch (sid) {
            case "123":
                System.out.println("學生資料為:" + li[0][0] + li[0][1] + li[0][2]);
                break;
            case "456":
                System.out.println("學生資料為:" + li[1][0] + li[1][1] + li[1][2]);
                break;
            case "789":
                System.out.println("學生資料為:" + li[2][0] + li[2][1] + li[2][2]);
                break;
            case "321":
                System.out.println("學生資料為:" + li[3][0] + li[3][1] + li[3][2]);
                break;
            case "654":
                System.out.println("學生資料為:" + li[4][0] + li[4][1] + li[4][2]);
                break;
        }

    }

}
