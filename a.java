import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int a[] = { 2,2,1,1,0,2,1,0,1,1,2,2 } , b[] = new int[a.length];
		int o=0,t=0,z=0,i;
		for(i=0;i<a.length;i++)
		{
		    switch(a[i])
		    {
		        case 0: 
		            b[z++] = 0; if(o>0) b[z+o-1]=1; break;
		        case 1: 
		            b[z+(o++)] = 1; break; 
		        case 2: 
		            b[a.length-(++t)] = 2;
		    }
		}
		System.out.println(Arrays.toString(b));
	}
}