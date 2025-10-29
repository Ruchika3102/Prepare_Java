
public class PlaceTilesOfSize1mOnFloor {
    public static void main(String[] args) {
        int n = 4, m = 1;
        System.out.println(placeTiles(n, m));
    }

    private static int placeTiles(int n, int m) {
        // base case
        if (n == m) {
            return 2; // either all vertical or all horizontal
        }
        if (n < m) {
            return 1; // only vertical placement possible
        }

        // place tile vertically
        int verticalPlacement = placeTiles(n - m, m);
        // place tile horizontally
        int horizontalPlacement = placeTiles(n - 1, m);

        return verticalPlacement + horizontalPlacement;
    }
}
