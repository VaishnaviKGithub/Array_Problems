//WAP to rotate the array element from start to end based on index value
class Problem28
{
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        int start=0;
        int end=1;
        int index=2;
        if(end+index<a.length)
        {
            for(int i=end; i>=start;i--)
            {
                for(int j=i;j<index+i;j++)
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]-=a[j+1];
                }
            }
            System.out.println(java.util.Arrays.toString(a));
        }
    }
}