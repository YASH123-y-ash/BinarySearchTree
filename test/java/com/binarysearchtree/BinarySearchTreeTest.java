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
}
