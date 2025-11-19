//WAP to print sum of elements of an array
public class Problem1 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,5,6,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        System.out.println(sum);

    }
    
}
