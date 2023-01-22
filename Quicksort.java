package quicksort;
import java.util.Arrays;

public class Quicksort {
    static int []arr={6,4,2,27,16,3};
    public static void sort(int left,int right){
        if(left<right){
            int i=left;
            int j=right+1;
            while(true){
                while(i+1 < arr.length && arr[++i] < arr[left]);
                while(j-1 >= 0 && arr[--j] > arr[left]);
                if(i >= j) {
                    break;
                }
                exchange(i,j);
            }
            exchange(left,j);
            sort(left,j-1);
            sort(j+1,right);
        }
    }
    public static void exchange(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        System.out.println("原始排序："+Arrays.toString(arr));
        quickSort(arr);
    }
    public static void quickSort(int [] arr) {
        sort(0,arr.length-1);
        System.out.println("Quicksort後排序："+Arrays.toString(arr));
    }
}
