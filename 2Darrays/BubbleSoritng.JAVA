import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // bubble sort on 2D array (by treating as 1D)
        for (int i = 0; i < r * c - 1; i++) {
            for (int j = 0; j < r * c - i - 1; j++) {
                int x1 = j / c, y1 = j % c;
                int x2 = (j + 1) / c, y2 = (j + 1) % c;

                if (arr[x1][y1] > arr[x2][y2]) {
                    int temp = arr[x1][y1];
                    arr[x1][y1] = arr[x2][y2];
                    arr[x2][y2] = temp;
                }
            }
        }

        // print sorted array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
