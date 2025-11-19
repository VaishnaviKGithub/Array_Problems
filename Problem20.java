//WAP to find Prime element from array
public class Problem20 {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++)
        {
            boolean b=false;
            int temp=arr[i];
            if(temp==0||temp==1)
            {
                b=true;
            }
            else{
                for(int j=2;j<=temp/2;j++)
                {
                    if(temp%j==0)
                    {
                        b=true;
                        break;
                    }
                }
                
            }
            if(!b)
            {
                System.out.println(arr[i]);
            }
            
        }

    }
    
}
