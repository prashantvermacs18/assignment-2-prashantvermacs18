/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
        public static void main(String[] args) {
            MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
            myBinarySearchTree.add(10);
            myBinarySearchTree.add(17);
            myBinarySearchTree.add(8);
            myBinarySearchTree.add(15);
            myBinarySearchTree.add(1);

            System.out.println("Traverse the tree in PreOrder :");
            traversePreOrder(myBinarySearchTree.getRoot());

            System.out.println();

            System.out.println("Traverse the tree in PostOrder :");
            traversePostOrder(myBinarySearchTree.getRoot());
        }
        public static void traversePreOrder(TreeNode<Integer> currentNode) {
            if (currentNode != null) {
                System.out.print(currentNode.getData() + " ");
                traversePreOrder(currentNode.getLeftChild());
                traversePreOrder(currentNode.getRightChild());
            }
        }
    }
}