package com.example.consultants.week6test;

public class SpiralPrinter {

    public void print(int[][] input) {

        int[] top = new int[input.length];
        int[] right = new int[input[0].length];
        int[] bottom = new int[input.length];
        int[] left = new int[input[0].length];

        //get top array
        for (int i = 0; i < input[0].length ; i++) {
            System.out.print(input[0][i] + " ");
            top[i] = input[0][i];
        }

        //right array
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i][input[0].length - 1] + " ");
            right[i] = input[i][input[0].length - 1];
        }

        //bot array
        for (int i = 0; i < input[input.length - 1].length; i++) {
            System.out.print(input[input.length - 1][i] + " ");
            bottom[i] = input[input.length - 1][i];
        }

        //left array
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i][0] + " ");
            left[i] = input[i][0];
        }
    }
}
