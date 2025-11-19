//WAP to find sum of three elements from array where target sum value is given

public class Problem24 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,98,87,66,55,453,343,433,332,25,23,232,34};
        int key=36;   
        
        for(int i=0;i<a.length-2;i++)
        {
            for(int j=i+1;j<a.length-1;j++)
            {
                for(int k=0;k<a.length;k++)
                {
                    if(key==a[i]+a[j]+a[k])
                    {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }

    }
    
}
