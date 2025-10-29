//we move only down and right
public class CountTotalPathOfMAze {
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countPaths(0, 0, n, m));
    }

    private static int countPaths(int i, int j, int n, int m) {
        // base case: reached the destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // base case: out of bounds
        if (i >= n || j >= m) {
            return 0;
        }

        // move down and right
        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }
}
