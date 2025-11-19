//WAP to find avg of even elements from the array
public class Problem6 {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        double avg=0;
        int length=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                avg+=arr[i];
                length++;
            }
        }
        System.out.println(avg/length);
    }
}
