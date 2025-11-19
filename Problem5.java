//WAP to find avg of odd elements from array
public class Problem5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,55,67,98,65,45,3};
        double avg=0;
        int length=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                avg+=arr[i];
                length++;
            }
        }

        System.out.println(avg/length);
    }
    
}
