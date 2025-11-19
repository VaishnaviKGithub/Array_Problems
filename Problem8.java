//WAP to find min element from array
public class Problem8 {
    public static void main(String[] args) {
        int arr[]={12,33,44,3,55,1,7,88,45,33,2};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println(min);
    }
    
}
