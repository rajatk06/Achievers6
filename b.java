public class Main
{
    public static int invCount(int a[])
    {
        int n = a.length;
        if(n<2) return 0;
        int ll=n/2,rl=n-n/2;
        int left[] = new int[ll] , right[] = new int[rl];
        System.arraycopy(a,0,left,0,n/2);
        System.arraycopy(a,n/2,right,0,n-n/2);
        
        int c = invCount(left) + invCount(right);
        
        int i=0,li=0,ri=0;
        while(li<ll && ri<rl)
        {
            if(left[li]<=right[ri])
            {
                a[i] = left[li]; li++;
            }
            else
            {
                a[ri] = right[ri]; ri++; 
                c += ll-li;
            }
            i++;
        }
        while(li<ll) { a[i] = left[li]; li++; i++; }
        while(ri<rl) { a[i] = right[ri]; ri++; i++; }
        
        return c;
    }
	public static void main(String[] args) 
	{
	    int[] a = {9,4,3,5,2,6,1,7,8};
	    
	    System.out.println( invCount(a) );
	}
}