package rootEqualsSumOfChildren2236;


public class Solution {
    public boolean checkTree(TreeNode root) {
        return (root.left.val + root.right.val == root.val);
    }
}
