//WAP to find second min element from array
public class Problem9 {
    public static void main(String[] args) {
        int arr[]={1,8,4,0,6,3,7,2};
        int min=arr[0];
        int smin=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            {
                smin=min;
                min=arr[i];
            }
            else if(smin>arr[i] && min!=arr[i])
            {
                smin=arr[i];
            }

        }

        System.out.println("min="+min);
        System.out.println("smin="+smin);
    }
    
}
