//WAP to find Second largest element in array
public class Problem4 {

    public static void main(String[] args) {
        int arr[]={12,23,54,77,98,76,87,99,44};
        int max=0;
        int smax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }

        System.out.println("max="+max);
        System.out.println("smax="+smax);

    }
    
}
