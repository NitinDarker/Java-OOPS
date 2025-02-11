public class Vector {
    public static void main(String args[]) {
        Points p1 = new Points();
        p1.setValue(15, 10);
        p1.getValue();

        Points p2 = new Points();
        p2.setValue(-5, 20);
        p2.getValue();

        p1.nearestToOrigin(p2);
        // p2.nearestToOrigin(p1) -> give same result
    }
}