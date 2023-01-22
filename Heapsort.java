package heapsort;
import java.util.Arrays;

public class Heapsort {
    public void sort(int arr[]) {
      int n=arr.length;
      for (int i=n/2-1;i>=0;i--) {
        heapify(arr,n,i);
      }
      for (int i=n-1;i>=0;i--) {
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        heapify(arr,i,0);
      }
    }
    void heapify(int arr[], int n, int i) {
      int max=i;
      int l=2*i+1;
      int r=2*i+2;
      if (l<n && arr[l]>arr[max])
        max=l;
      if (r<n && arr[r]>arr[max])
        max=r;
      if (max != i) {
        int swap=arr[i];
        arr[i]=arr[max];
        arr[max]=swap;
        heapify(arr,n,max);
      }
    }
    static void printArray(int arr[]) {
      int n=arr.length;
      for (int i=0;i< n;++i)
        System.out.print(arr[i]+" ");
      System.out.println();
    }
    public static void main(String args[]) {
      int arr[] = {6,4,2,27,16,3};
      System.out.println("原始排序："+Arrays.toString(arr));

      Heapsort x = new Heapsort();
      x.sort(arr);
      System.out.println("Heapsort後排序："+Arrays.toString(arr));
    }
}
