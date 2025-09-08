package com.rays.basic;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 5;   // number of terms (you can change this value)
        

        System.out.print("Harmonic Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
            
        }

       
    }
}

