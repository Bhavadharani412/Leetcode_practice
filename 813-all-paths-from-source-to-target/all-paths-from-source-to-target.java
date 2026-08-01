class Solution {
    static List<List<Integer>> ans;
    static int n ;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        n = graph.length;
        path.add(0);
        dfs(0,graph, path);
        return ans;
    }
    public void dfs(int src, int[][] graph, List<Integer> path)
    {
        // base case
        if(src == n-1){
            ans.add(new ArrayList<>(path));
            return;
        }
        // add all neighbours
        for (int neighbour : graph[src]) {
            path.add(neighbour);              // Choose
            dfs(neighbour, graph, path);      // Explore
            path.remove(path.size() - 1);     // Backtrack
        }
    }
}