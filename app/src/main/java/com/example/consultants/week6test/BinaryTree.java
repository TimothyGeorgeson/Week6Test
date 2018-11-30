package com.example.consultants.week6test;

import java.util.Stack;

public class BinaryTree {

    //node used to hold value, and left and right child nodes
    static class Node {
        int value;
        Node left, right;
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        boolean isChild() {
            if (left == null && right == null) return true;
            else return false;
        }
    }

    Node root;

    //uses stack to print values of tree in preOrder
    public void preOrderTraversal() {

        Stack<Node> nodes = new Stack<>();
        nodes.push(root);

        while(!nodes.isEmpty()) {
            Node current = nodes.pop();
            System.out.print(current.value + " ");

            //push right first
            if (current.right != null) {
                nodes.push(current.right);
            }
            //then push left, so the left is the first element to be popped
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
    }

    //creates sample tree for testing
    public BinaryTree createTree() {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        return tree;
    }
}
