class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] f : flights) {
            adj.get(f[0]).add(new int[]{f[1], f[2]});
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0});
        int flightsTaken = 0;
        while (!q.isEmpty() && flightsTaken <= k) {
            int size = q.size();
            while (size-- > 0) {
                int[] current = q.poll();
                int u = current[0];
                int cost = current[1];
                for (int[] edge : adj.get(u)) {
                    int v = edge[0];
                    int wt = edge[1];
                    if (cost + wt < dist[v]) {
                        dist[v] = cost + wt;
                        q.offer(new int[]{v, dist[v]});
                    }
                }
            }
            flightsTaken++;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}