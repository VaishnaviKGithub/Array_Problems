//WAP to append sum of digit to the end od the element of an array
public class Problem16 {
    public static void main(String[] args) {
        int arr[]={1234,2345,3456,456,567,678,789};
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int temp=arr[i];
            while(temp!=0)
            {
                sum+=temp%10;
                temp/=10;
            }
            if(sum<10)
            {
                arr[i]*=10;
            }
            else{
                arr[i]*=100;
            }
            arr[i]+=sum;
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
}
