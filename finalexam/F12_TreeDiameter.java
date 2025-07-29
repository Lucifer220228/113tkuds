package finalexam;

public class F12_TreeDiameter {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    // 儲存最大直徑（全域變數）
    static int maxDiameter = 0;

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        int diameter = treeDiameter(root);
        System.out.println("二元樹的直徑為：" + diameter);
    }

    
    public static int treeDiameter(TreeNode root) {
        maxDiameter = 0;
        postOrderHeight(root);
        return maxDiameter;
    }

   
    private static int postOrderHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = postOrderHeight(node.left);   // 左子樹高度
        int rightHeight = postOrderHeight(node.right); // 右子樹高度

        
        int currentDiameter = leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter, currentDiameter);

      
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
