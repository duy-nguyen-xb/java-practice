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
public class BinaryTreePreorderTraversal {

    //############################################################
    //   Pre-order traversal : Root -> Left -> Right
    //############################################################
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root != null) {
            preorderTraversal(root, result);
        }

        return result;
    }

    private void preorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Visit root
        result.add(node.val);

        // Traverse left node
        // The checking before call the function seems to be useless because we already check null before at the beginning of method.
        // However, the cost for a check is better than a function call then do nothing,
        // furthermore, it's safe for implementation changing or enhancement
        if (node.left != null) {
            preorderTraversal(node.left, result);
        }

        // Traverse right node
        if (node.right != null) {
            preorderTraversal(node.right, result);
        }
    }
}

