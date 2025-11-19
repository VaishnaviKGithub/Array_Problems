    //WAP to find nearest elements from array

public class Problem27 {
    public static void main(String[] args) {
        int a[]={18,23,53,6,787,65,67,54,43,67,7,43};
        int arr[]=new int[a.length-1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Math.abs(a[i]-a[i+1]);
        }
        System.out.println(java.util.Arrays.toString(arr));
        java.util.Arrays.sort(arr);
        int min=arr[0];
        System.out.println(min);
        for(int i=0;i<a.length-1;i++)
        {
            if(Math.abs(a[i]-a[i+1])==min)
            {
                System.out.println(a[i]+" "+a[i+1]);
            }
        }

    }
}


