import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        while(n--!=0){
            int arr[]=new int[s1.nextInt()];
            for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
            System.out.println("Enter k");
            System.out.println("Kth smallest is "+kthSmallest(arr,s1.nextInt()));
        }
    }
    public static int kthSmallest(int[] arr,int k)  {
        Arrays.sort(arr);
        return arr[k-1]; 
    }
}