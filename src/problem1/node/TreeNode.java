/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode<E> {
    private E data;
    private TreeNode<E> leftChild;
    private TreeNode<E> rightChild;

    public TreeNode(E data) {
        this.data = data;
    }
}

