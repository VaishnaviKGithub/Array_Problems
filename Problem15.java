//WAP to relace array element by the first digit 
public class Problem15 {
    public static void main(String[] args) {
        int arr[]={1234,2345,3456,456,567,678,789};
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]>9)
            {
                arr[i]=arr[i]/10;
            }
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
    
}
