package com.blz.binarysearch;

public class BinarySearch {
    Node root;
    private class Node {
        private Integer data;
        private Node left;
        private Node right;

        public Node(Integer data) {
            this.data = data;
        }
    }
    public void insert(Integer data) {

        root = insert(root, data);
    }
    private Node insert(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return root;
        }
        if(root.data < data) {
            root.right = insert(root.right, data);
        }
        if(root.data > data) {
            root.left = insert(root.left, data);
        }
        return root;
    }
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.insert(55);
        binarySearch.insert(9);
        binarySearch.insert(100);
        binarySearch.insert(11);
        binarySearch.insert(6);
        binarySearch.insert(99);
        binarySearch.insert(77);
    }

}