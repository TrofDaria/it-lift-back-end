package it.sevenbits.workshop.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private final  int CELL_MAX_VALUE = 100;
    private Cell[][] matrix;

    private Matrix() {
    }

    public Matrix(int rowsLen, int columnsLen) {
        matrix = new Cell[rowsLen][columnsLen];
        fillMatrixByRandomValues();
    }

    public void inverseMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++){
                matrix[i][j].inverse();
            }
        }
    }

    public void fillMatrixByRandomValues() {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++){
                int cellValue = rand.nextInt(CELL_MAX_VALUE);
                Cell newCell = new Cell(i, j, cellValue);
                matrix[i][j]= newCell;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++){
                sb.append(matrix[i][j].getValue()).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
