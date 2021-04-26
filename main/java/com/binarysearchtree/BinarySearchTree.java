package com.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>> {

    private BinaryNode<K> root;

    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree problem");
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null);
        return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) +
                this.getSizeRecursive(current.right);
    }

    public Boolean search(BinaryNode<K> current, K key) {
        if (current == null) return false;
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return true;
        if (compareResult < 0) {
            return search(current.left, key);
        } else {
            return search(current.right, key);
        }
    }
}

