
import java.util.Arrays;

class Arr {
    public static void main(String args[]) {
        int a[] = new int[5];
        int [][]b = new int[5][];
        System.out.println(Arrays.toString(a));
        System.out.println(a.hashCode());
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(b.length);
        // System.out.println(b[0].length);
        b[0] = new int[3];
        System.out.println(b[0]);
        System.out.println(b[0].hashCode());
        System.out.println(b[0][2]);
    }
}
