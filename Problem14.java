//WAP to swap first and last element of array
public class Problem14 {

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        arr[0]=arr[0]+arr[arr.length-1];
        arr[arr.length-1]=arr[0]-arr[arr.length-1];
        arr[0]-=arr[arr.length-1];
    
    System.out.println(java.util.Arrays.toString(arr));
    }
}
