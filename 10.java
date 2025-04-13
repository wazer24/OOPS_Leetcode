// Q10.All Possible Full Binary Trees
class Solution {
    private List<TreeNode>[] m = new List[30];

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) return Collections.emptyList(); 

        if (m[n] != null) return m[n];

        if (n == 1) {
            TreeNode a = new TreeNode(0);
            m[n] = Collections.singletonList(a);
            return m[n];
        }

        List<TreeNode> r = new ArrayList<>();

        for (int i = 1; i < n; i += 2) {
            int j = n - 1 - i;

            List<TreeNode> l1 = allPossibleFBT(i);
            List<TreeNode> l2 = allPossibleFBT(j);

            for (TreeNode a : l1) {
                for (TreeNode b : l2) {
                    TreeNode c = new TreeNode(0);
                    c.left = a;
                    c.right = b;
                    r.add(c);
                }
            }
        }

        m[n] = r;
        return r;
    }
}
