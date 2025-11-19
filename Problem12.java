//WAP to shift last element to first in an array
public class Problem12 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=arr.length-1;i>0;i--)
        {
           arr[i-1]=arr[i-1]+arr[i];
           arr[i]=arr[i-1]-arr[i];
           arr[i-1]=arr[i-1]-arr[i];
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    
}
