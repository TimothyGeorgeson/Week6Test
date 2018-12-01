package com.example.consultants.week6test;

public class SpiralPrinter {

    public void print(int[][] input) {

        int startRow = 0;
        int endRow = input.length;
        int startCol = 0;
        int endCol = input[0].length;
        int i;

        while (startRow < endRow && startCol < endCol)
        {
            //prints toprow, then increments start row (so top row won't be included next pass)
            for (i = startCol; i < endCol ; i++) {
                System.out.print(input[startRow][i] + " ");
            }
            startRow++;

            //prints lastcol, decrements end col
            for (i = startRow; i < endRow; i++) {
                System.out.print(input[i][endCol - 1] + " ");
            }
            endCol--;

            //prints bottom row, decrements end row
            if (startRow < endRow) {
                for (i = endCol - 1; i >= startCol; i--) {
                    System.out.print(input[endRow - 1][i]+ " ");
                }
            }
            endRow--;

            //prints first col, increases starting column
            if (startCol < endCol) {
                for (i = endRow - 1; i >= startRow; i--) {
                    System.out.print(input[i][startCol] + " ");
                }
            }
            startCol++;

        }
    }
}
