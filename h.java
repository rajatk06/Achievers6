import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        while(n--!=0){
            int arr[]=new int[s1.nextInt()];
            for(int i=0;i<arr.length;i++)
                arr[i]=s1.nextInt();
            arr=reArrange(arr,arr.length);
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        }
    }
    static int[] reArrange(int[] arr,int n){
        int temp[] = new int[n];
        int small=0, large=n-1;
        boolean flag = true;
        for (int i=0;i<n;i++){ 
            if(flag) 
                temp[i]=arr[large--]; 
            else
                temp[i]=arr[small++]; 
      
            flag = !flag; 
        }
        return temp;
    }
}