package org.example.lect3;

public class MultiArrayLoops {
    public static void main(String[] args) {
        // pętla generująca 'macierz jednostkową' 10x10
        int dim = 10;
        OUT: for (int i = 0; i < dim ; i++) {        // iteruje po wierszach
            IN: for (int j = 0; j < dim; j++) {    // iteruje po kolumnach
                if (i == j || i == dim - 1 - j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
