//WAP to find largest element in array
public class Problem3 {
    
    public static void main(String[] args) {
        int arr[]={12,34,55,78,89,32,1,2,93};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
