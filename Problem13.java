//WAP to shift first element in array to the last
public class Problem13 {

    public static void main(String[] args) {
        
    int arr[]={1,2,3,4,5,6,7};
    for(int i=0;i<arr.length-1;i++)
    {
        arr[i]+=arr[i+1];
        arr[i+1]=arr[i]-arr[i+1];
        arr[i]-=arr[i+1];

    }

    System.out.println(java.util.Arrays.toString(arr));
    }
   
    
}
