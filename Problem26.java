//WAP to find adjacent values from array
public class Problem26 {
    public static void main(String[] args) {
        int a[]={18,23,53,6,787,65,67,54,43,67,7,43};
        int arr[]=new int[a.length-1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Math.abs(a[i]-a[i+1]);
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
