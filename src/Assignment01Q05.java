public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int n = m.length;
        int[] queue = new int[n];
        boolean[] visited = new boolean[n];

        int front = 0;
        int rear = 0;

        queue[rear++] = i;
        visited[i] = true;

        int distance = 0;

        while (front < rear) {

            int size = rear - front;
            distance++;

            for (int k = 0; k < size; k++) {

                int current = queue[front++];

                for (int v = 0; v < n; v++) {

                    if (m[current][v] == 1 && !visited[v]) {

                        if (v == j) {
                            return distance;
                        }

                        visited[v] = true;
                        queue[rear++] = v;
                    }
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}

