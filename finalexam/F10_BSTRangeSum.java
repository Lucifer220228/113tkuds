package finalexam;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        int L = 7, R = 15;
        int sum = rangeSumBST(root, L, R);
        System.out.println("區間 [" + L + ", " + R + "] 範圍內的總和為：" + sum);
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        int sum = 0;
        if (root.val > L) {
            sum += rangeSumBST(root.left, L, R);
        }
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        if (root.val < R) {
            sum += rangeSumBST(root.right, L, R);
        }

        return sum;
    }
}

