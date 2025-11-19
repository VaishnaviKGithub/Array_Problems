//WAP to shift first digit to last from each elements of array
public class Problem18 {
    
    public static void main(String[] args) {
        int arr[]={123,234,345,456,567,678,789};
        for(int i=0;i<arr.length;i++)
        {
            int first=arr[i];
            int count=1;
            while(first>9)
            {
                first/=10;
                count*=10;
            }
            arr[i]%=count;
            arr[i]*=10;
            arr[i]+=first;

        }

        System.out.println(java.util.Arrays.toString(arr));
    }
}
