package com.example.consultants.week6test;

public class MainTest {

    public static void main(String[] args) {
        //merge sort
        int[] input = {5, 2, 8, 9, 4, 15, 17, 13, 20, 10, 1, 3, 6, 7, 22, 48, 30, 12, 33, 21};
        mergeSort(input, input.length);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

        //binary tree
        BinaryTree tree = new BinaryTree().createTree();
        tree.preOrderTraversal();
        System.out.println();

        //Spiral Printer
        int[][] twoDArray1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] twoDArray2 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        SpiralPrinter spiralPrinter = new SpiralPrinter();

        spiralPrinter.print(twoDArray1);
        System.out.println();
        spiralPrinter.print(twoDArray2);
        System.out.println();

        //Checking for correct parentheses/bracket order
        String test1 = "({})[]"; // true
        String test2 = "[]{]}["; // false

    }

    public static void mergeSort(int[] input, int length) {

        if (length <= 1) {
            return;
        }
        //find midpoint of input array
        int middle = length / 2;

        //create 2 subarrays, from 0 to mid, and from mid to length
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = input[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = input[i];
        }

        //call function recursively
        mergeSort(left, left.length);
        mergeSort(right, right.length);

        //merge values from both subarrays
        merge(input, left, right);
    }

    public static void merge(int[] input, int[] left, int[] right) {
        //index counters
        int lIndex = 0;
        int rIndex = 0;
        int iIndex = 0;
        //sort elements depending on if leftarray or rightarray value is smaller
        for (int i = 0; i < input.length; i++) {
            if (i < left.length && i < right.length) {
                if (left[i] < right[i]) {
                    input[iIndex] = left[i];
                    lIndex++;
                } else {
                    input[iIndex] = right[i];
                    rIndex++;
                }
                iIndex++;
            }
        }

        //if left side was longer, add rest of array elements
        while (lIndex < left.length) {
            input[iIndex] = left[lIndex];
            iIndex++;
            lIndex++;
        }
        //if right side was longer, add rest of elements
        while (rIndex < right.length) {
            input[iIndex] = right[rIndex];
            iIndex++;
            rIndex++;
        }
    }
}
