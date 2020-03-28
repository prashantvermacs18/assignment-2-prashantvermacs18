/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

public class MyBinarySearchTree<E> implements MyBinarySearchTreeADT<E> {
    private TreeNode<E> root;
    public int numberOfLeftChild = 0;
    private int maxLevel = 1;

    public TreeNode<E> getRoot() {
        return root;
    }
}
