class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int src, int des) {
        if(src == des) return true;
        Map<Integer, List<Integer>> gr = new HashMap();
        boolean[] vis = new boolean[n];
        for(int i = 0; i < n; i++) gr.put(i, new ArrayList<>());
        for(int[] ed : edges)
        {
            gr.get(ed[0]).add(ed[1]);
            gr.get(ed[1]).add(ed[0]);
        }
        dfs(gr, vis, src, des);
        return found;
    }
    private void dfs(Map<Integer, List<Integer>> gr, boolean[] vis, int src, int des)
    {
        if(vis[src] || found) return;
        vis[src] = true;
        for(int nei : gr.get(src))
        {
            if(nei == des)
            {
                found = true;
                break;
            }
            if(!vis[nei]) dfs(gr, vis, nei, des);
        }
    }
}