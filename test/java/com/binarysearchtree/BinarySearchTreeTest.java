package com.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    @Test
    public void givenElementsWhenAddedToBinarySearchTree_ShouldReturnSize() {
        BinarySearchTree<Integer> binarySearchTree =  new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        int size = binarySearchTree.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenElementsWhenAddedToBinaryTree_ShouldReturnSize() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(23);
        binarySearchTree.add(3);
        binarySearchTree.add(73);
        binarySearchTree.add(63);
        binarySearchTree.add(5);
        binarySearchTree.add(10);
        binarySearchTree.add(26);
        binarySearchTree.add(50);
        binarySearchTree.add(55);
        int size = binarySearchTree.getSize();
        Assertions.assertEquals(12,size);
    }

    @Test
    public void givenElementsAdded_WhenSearched_ShouldReturnTrue() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(23);
        binarySearchTree.add(3);
        binarySearchTree.add(73);
        binarySearchTree.add(63);
        binarySearchTree.add(5);
        binarySearchTree.add(10);
        binarySearchTree.add(26);
        binarySearchTree.add(50);
        binarySearchTree.add(55);
        Boolean result = binarySearchTree.search(63);
        Assertions.assertTrue(result);
    }
}
