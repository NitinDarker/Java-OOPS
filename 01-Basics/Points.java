public class Points {
    // Class to store two co-ordinates in a plane
    int x, y;

    void setValue(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getValue() {
        System.out.println("The value of x = " + x);
        System.out.println("The value of y = " + y);
    }

    void nearestToOrigin(Points p2) {
        // To find the point nearest to origin in x-direction
        int x1 = this.x;
        int x2 = p2.x;

        int diff1 = x1 - 0;
        int diff2 = x2 - 0;

        // If points lie on negative x-axis
        if (diff1 < 0) diff1 = -1 * diff1;
        if (diff2 < 0) diff2 = -1 * diff2;

        int near = (diff1 < diff2) ? x1 : x2;

        System.out.println("Point x = " + near + " is nearest to origin in x-direction");
    }
}
