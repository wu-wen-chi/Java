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
public class topic33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> sub=new ArrayList<String>();
        sub.add("國文");
        sub.add("英文");
        sub.add("微積分");
        sub.add("體育");
        sub.add("程式設計");

        Scanner s=new Scanner(System.in);
        int point[] = new int[5];

        for(int count = 0; count < point.length; count++){
            System.out.print(sub.get(count)+":");
            int number=s.nextInt();
            point[count] = number;
        }

        LongSummaryStatistics cal = Arrays.stream(point)
            .asLongStream()
            .summaryStatistics();
        
        System.out.println("平均分數: " + cal.getAverage());
        System.out.println("最高分科目: " + cal.getMax());
        System.out.println("最低分科目: " + cal.getMin());
        
    }
    
}
