import java.util.Scanner;


public class Eight {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int t=s1.nextInt();
        while(t--!=0){
            int arr1[]=new int[s1.nextInt()];
            int arr2[]=new int[s1.nextInt()];
            for(int i=0;i<arr1.length;i++)
                arr1[i]=s1.nextInt();
            for(int i=0;i<arr2.length;i++)
                arr2[i]=s1.nextInt();
            int result[]=mergeArrays(arr1,arr2,arr1.length,arr2.length);
            for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
            System.out.println();
        }
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2, int n1,int n2){ 
        int[] arr3=new int[n1+n2];
        int i = 0, j = 0, k = 0; 
        while (i<n1 && j <n2){ 
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        }
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
        while (j < n2) 
            arr3[k++] = arr2[j++]; 
        return arr3;
    } 
}