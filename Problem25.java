//WAP to find farest element from array
public class Problem25 {
    public static void main(String[] args) {
        int[] a={1,8,5,6,3,4,8,43,4,76,7};
        java.util.Arrays.sort(a);
        System.out.println(a[0]+"   "+a[a.length-1]);
    }
    
}
