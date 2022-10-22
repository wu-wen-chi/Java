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
public class topic4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner xx = new Scanner(System.in);
        System.out.println("X軸座標:");
        Scanner yy = new Scanner(System.in);
        System.out.println("Y軸座標:");
        int x = xx.nextInt();
        int y = yy.nextInt();
        double distance = Math.pow(x, 2) + Math.pow(y, 2);
        if (x > 0 && y > 0) {
            System.out.printf("該點位於第一象限,離原點距離根號%.0f\n", distance);
        }
        if (x > 0 && y < 0) {
            System.out.printf("該點位於第四象限,離原點距離根號%.0f\n", distance);
        }
        if (x < 0 && y > 0) {
            System.out.printf("該點位於第二象限,離原點距離根號%.0f\n", distance);
        }
        if (x == 0 && y == 0) {
            System.out.printf("該點位於原點\n");
        }
        if (x < 0 && y < 0) {
            System.out.printf("該點位於第三象限,離原點距離根號%.0f\n", distance);
        }
        if (x == 0 && y < 0) {
            System.out.printf("該點位於下半平面Y軸上,離原點距離根號%.0f\n", distance);
        }
        if (x == 0 && y > 0) {
            System.out.printf("該點位於上半平面Y軸上,離原點距離根號%.0f\n", distance);
        }
        if (x < 0 && y == 0) {
            System.out.printf("該點位於左半平面X軸上,離原點距離根號%.0f\n", distance);
        }
        if (x > 0 && y == 0) {
            System.out.printf("該點位於右半平面X軸上,離原點距離根號%.0f\n", distance);
        }
    }

}
