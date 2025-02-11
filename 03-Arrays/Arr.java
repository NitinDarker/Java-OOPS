import java.util.Arrays;
public class Arr {
    @SuppressWarnings({"ImplicitArrayToString", "ArrayHashCode"})
    public static void main(String args[]) {
        int a[] = new int[5];
        int [][]b = new int[5][];
        System.out.println("1-D Array:");
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.hashCode(a));

        System.out.println("\n2-D Array:");
        System.out.println(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.hashCode(b));
        System.out.println(b.length);
        // System.out.println(b[0].length);

        b[0] = new int[3];
        System.out.println(b[0]);
        System.out.println(b[0].hashCode());
        System.out.println(b[0][2]);
    }
}
