//WAP to find the missing number from array


public class Problem22 {
    public static void main(String args[])
    {
        int a[]={1,2,3,5,6,7,8};
        java.util.Arrays.sort(a);
        int sum=(a[a.length-1]*(a[a.length-1]+1))/2;
        int sum2=0;
        for(int i=0;i<a.length;i++)
        {
            sum2+=a[i];
        }
        System.out.println(sum-sum2);
    }
    
}
