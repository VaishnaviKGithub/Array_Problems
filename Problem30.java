// WAP to merge two arrays in alternate manner
public class Problem30 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = {11, 22, 33, 44, 55, 66};

        int c[] = new int[a.length + b.length];

        int min = Math.min(a.length, b.length); 
        int count = 0;

        // Alternate merging
        for (int i = 0; i < min; i++) {
            c[count++] = a[i];
            c[count++] = b[i];
        }

        // Add remaining elements of a[]
        if (a.length > min) {
            for (int i = min; i < a.length; i++) {
                c[count++] = a[i];
            }
        }

        // Add remaining elements of b[]
        if (b.length > min) {
            for (int i = min; i < b.length; i++) {
                c[count++] = b[i];
            }
        }

        System.out.println(java.util.Arrays.toString(c));
    }
}
