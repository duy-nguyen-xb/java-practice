package today.ucancode.javapractice.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * A binary tree is one of the most typical tree structure in which each node has at most two children,
 * which are referred to as the left child and the right child.
 * <p>
 * Pre-order traversal : Root -> Left -> Right
 * In-order traversal  : Left -> Root -> Right
 * Post-order traversal: Left -> Right -> Root
 */
public class BinaryTreeInorderTraversal {

    //############################################################
    //   In-order traversal : Root -> Left -> Right
    //############################################################
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root != null) {
            inorderTraversal(root, result);
        }

        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Traverse left node
        // The checking before call the function seems to be useless because we already check null before at the beginning of method.
        // However, the cost for a check is better than a function call then do nothing,
        // furthermore, it's safe for implementation changing or enhancement
        if (node.left != null) {
            inorderTraversal(node.left, result);
        }

        // Visit root
        result.add(node.val);

        // Traverse right node
        if (node.right != null) {
            inorderTraversal(node.right, result);
        }
    }
}
