package com.example.consultants.week6test;

public class SpiralPrinter {

    public void print(int[][] input) {

        int startRow = 0;
        int endRow = input.length;
        int startCol = 0;
        int endCol = input[0].length;
        int i = 0;

        while (startRow < endRow && startCol < endCol)
        {
            for (i = startCol; i < endCol ; i++) {
                System.out.print(input[startRow][i] + " ");
            }
            startRow++;

            for (i = startRow; i < endRow; i++) {
                System.out.print(input[i][endCol - 1] + " ");
            }
            endCol--;

            if (startRow < endRow) {
                for (i = endCol - 1; i >= startCol; i--) {
                    System.out.print(input[endRow - 1][i]+ " ");
                }
            }
            endRow--;

            if (startCol < endCol) {
                for (i = endRow - 1; i >= startRow; i--) {
                    System.out.print(input[i][startCol] + " ");
                }
            }
            startCol++;

        }

            int[] top = new int[input.length];
        int[] right = new int[input[0].length];
        int[] bottom = new int[input.length];
        int[] left = new int[input[0].length];


    }
}
