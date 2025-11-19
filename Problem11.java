//WAP to reverse array without using third variable
public class Problem11 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length/2;i++)
        {
            arr[i]=arr[i]+arr[arr.length-1-i];
            arr[arr.length-i-1]=arr[i]-arr[arr.length-1-i];
            arr[i]-=arr[arr.length-1-i];
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    
}
