//WAP to display first 50 prime numbers in reverse order
public class Problem21 {
    boolean checkPrime(int n)
    {
        boolean b=false;
        if(n==0||n==1)
        {
            b=true;
        }
        else{
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    b=true;
                }
            }
        }
        return !b;
    }
    public static void main(String[] args) {
        int arr[]=new int[50];
        int count=0;
        int num=0;
        Problem21 p=new Problem21();
        while(count!=arr.length)
        {
            if(p.checkPrime(num))
            {
                arr[count++]=num;
            }
            num++;
        }
        System.out.println(java.util.Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
         System.out.println(java.util.Arrays.toString(arr));

    }
    
}
