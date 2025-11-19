//WAP to reverse each elements from array
public class Problem17 {
    public static void main(String[] args) {
        int arr[]={1234,456,6677,890,775};
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            int rev=0;
            while(temp!=0)
            {
                rev*=10;
                rev+=temp%10;
                temp/=10;
            }
            arr[i]=rev;
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
    
}
