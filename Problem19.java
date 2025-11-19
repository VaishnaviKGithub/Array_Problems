//WAP to find the palindrome element from array
public class Problem19 {
  
    public static void main(String[] args) {
        int arr[]={12,234,345,454,567,6786,9889,787};
        for(int i=0;i<arr.length;i++)
        {
            int rev=0;
            int temp=arr[i];
            while(temp!=0)
            {
                rev*=10;
                rev+=temp%10;
                temp/=10;
            }
            if(rev==arr[i])
            {
                System.out.println(arr[i]);
            }
        }
    }
}
