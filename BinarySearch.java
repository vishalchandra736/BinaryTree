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

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void search(Integer data) {
        boolean inList = search(root, data);
        System.out.println();
        if(inList == true) {
            System.out.println(data + " is present in List");
            return;
        }
        System.out.println(data +" is Not present in List");
    }
    private boolean search(Node root, Integer data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data < data) {
            return search(root.right, data);
        }
        if (root.data > data) {
            return search(root.left, data);
        }
        return false;
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
        binarySearch.inorder();
        binarySearch.search(100);
        binarySearch.search(7);
    }
}