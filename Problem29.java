//WAP to Merge two array
public class Problem29 {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int b[]={50,60,70,80};
        int c[]=new int[a.length+b.length];

        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else{
                c[i]=b[i-b.length];
            }
        }

        System.out.println(java.util.Arrays.toString(c));
    }
    
}
