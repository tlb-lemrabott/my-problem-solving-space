https://leetcode.com/problems/same-tree/?envType=problem-list-v2&envId=breadth-first-search

public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    }
    if (p == null || q == null || p.val != q.val) {
        return false;
    }
    boolean isLeftSame = isSameTree(p.left, q.left);
    boolean isRightSame = isSameTree(p.right, q.right);
    return isLeftSame && isRightSame;
}