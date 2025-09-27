import edu.princeton.cs.algs4.StdDraw;

public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] visited = new boolean[2 * n + 1][2 * n + 1];

        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int stepSize = 1;

        while (Math.abs(x) - 1 < n && Math.abs(y) - 1 < n) {
            // đi lên stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) - 1 < n && Math.abs(y) - 1 < n; i++) {
                visited[x + n][y + n] = true;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                y++; steps++;
            }

            // đi trái stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) - 1 < n && Math.abs(y) - 1 < n; i++) {
                visited[x + n][y + n] = true;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                x--; steps++;
            }
            stepSize++; // tăng bước sau 2 hướng

            // đi xuống stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) - 1 < n && Math.abs(y) - 1 < n; i++) {
                visited[x + n][y + n] = true;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                y--; steps++;
            }

            // đi phải stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) - 1 < n && Math.abs(y) - 1 < n; i++) {
                visited[x + n][y + n] = true;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                x++; steps++;
            }
            stepSize++; // tăng bước sau 2 hướng
        }

       // StdOut.println("Total steps = " + steps);
    }
}
