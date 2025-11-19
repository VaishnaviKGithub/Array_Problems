//WAP to find sum of two elements from array where target sum value is given

public class Problem23 {
    
    public static void main(String[] args) {
        int a[]={21,243,32,2,12,44,22,45,9,4,6,7,3,324,3,5,34};
        int key=36;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(key==a[i]+a[j])
                {
                    System.out.println(a[i]+"  "+a[j]);
                }
            }
        }
    }
}
