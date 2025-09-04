package com.rays.basic;

public class Tables2D {
    public static void main(String[] args) {
        int[][] tables = new int[9][10]; // 9 rows (tables 2-10), 10 columns (1-10)

       
        for (int i = 0; i < 9; i++) {          // rows for 2 to 10
            for (int j = 0; j < 10; j++) {     // columns for 1 to 10
                tables[i][j] = (i + 2) * (j + 1);
            }
        }

        // Display the array
        System.out.println("Multiplication Tables (2 to 10): ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tables[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

