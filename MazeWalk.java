package doublylinkedlist;
public class MazeWalk{
    static int[][] map={
        {1,1,1,1,1},
        {1,0,1,0,1},
        {1,0,1,0,1},
        {1,0,0,0,1},
        {1,1,1,1,1}};
    
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("數字 1: 牆壁");
        System.out.println("數字 2: 走過的路徑");
    }
}