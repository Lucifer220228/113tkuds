package finalexam;

public class F11_BSTClosestValue {

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
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        int target = 14;
        int closest = closestValue(root, target);
        System.out.println("最接近 " + target + " 的節點值為：" + closest);
    }

    public static int closestValue(TreeNode root, int target) {
        int closest = root.val;

        while (root != null) {
         
            if (Math.abs(root.val - target) < Math.abs(closest - target) ||
                (Math.abs(root.val - target) == Math.abs(closest - target) && root.val < closest)) {
                closest = root.val;
            }

         
            if (target < root.val) {
                root = root.left;
            } else if (target > root.val) {
                root = root.right;
            } else {
                return root.val;
            }
        }

        return closest;
    }
}

