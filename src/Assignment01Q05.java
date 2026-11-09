public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        boolean[] visited = new boolean[m.length];
        int[] queue = new int[m.length];
        int[] dist = new int[m.length];
        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;
        visited[i] = true;
        dist[i] = 0;
        while (tail > head) {
            for (int vertex = 0; vertex < m[0].length; vertex++) {
                if (m[queue[head]][vertex] == 1 && !visited[vertex]) {
                    if (vertex == j) {
                        return dist[queue[head]] + 1;
                    }
                    queue[tail] = vertex;
                    tail++;
                    visited[vertex] = true;
                    dist[vertex] = dist[queue[head]] + 1;
                }
            }
            head++;
            
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