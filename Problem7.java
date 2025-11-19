//WAP to display greatest element than the avg of an array
public class Problem7 {
    public static void main(String[] args) {
        int arr[]={1,35,545,36,74,48,34,2,4,2};
        double avg=0;
        for(int i=0;i<arr.length;i++)
        {
            avg+=arr[i];
        }
        avg=avg/arr.length;
        System.out.println(avg);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            {
                System.out.println(arr[i]);
            }
        }

    }
    
}
