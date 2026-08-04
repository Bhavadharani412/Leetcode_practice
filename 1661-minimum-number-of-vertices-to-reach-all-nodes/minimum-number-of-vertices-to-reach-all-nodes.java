class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree = new int[n];
        // Count incoming edges
        for (List<Integer> edge : edges) {
            int to = edge.get(1);
            indegree[to]++;
        }
        List<Integer> ans = new ArrayList<>();
        // Nodes with indegree 0 are the answer
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}