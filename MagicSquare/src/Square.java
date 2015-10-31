import java.util.Scanner;

/**
 *     Square Object
 * @author Cameron Kelliher
 */

public class Square {

    private int[][] square;
    private int size;

    public Square(int size) {
        square = new int[size][size];
        this.size = size;
    }

    /**
     * Returns a string of "square" of the
     * variables contained within the instance
     * using escape characters
     */
    public String toString() {
        String converted = new String();
        for(int[] a : square) {
            for(int b : a) {
                converted += b + " ";
            }
            converted += "\n";
        }
        return converted;
    }

    /**
     * Returns the total of each item in
     * the given column (index from 0)
     * @param index of the column
     */
    public int totalColumn(int index) {
        int total = 0;
        for(int[] a : square) {
            total += a[index];
        }
        return total;
    }

    /**
     * Returns the total of each item in
     * the given row (index from 0)
     * @param index of the row
     */
    public int totalRow(int index) {
        int total = 0;
        for(int a : square[index]) {
            total += a;
        }
        return total;
    }

    /**
     * Returns the total of each item in
     * the diagonal of the square
     * @param way or 2 (1 for \ 2 for /)
     * @return -1 if invalid "way"
     */
    public int totalDiagonal(int way) {
        int total = 0;
        int countIndex;
        if(way == 1) {
            countIndex = 0;
            for (int[] a : square) {
                total += a[countIndex];
                countIndex++;
            }
        } else if(way == 2) {
            countIndex = square.length - 1;
            for(int a = 0; a < square.length; a++) {
                total += square[a][countIndex];
                countIndex--;
            }
        } else {
            return -1;
        }
        return total;
    }

    /**
     * Reads the square data from
     * a scanner object
     * @param s the scanner
     */
    public void readSquare(Scanner s) {
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                square[row][col] = s.nextInt();
            }
        }
    }

    /**
     * Checks if diagonals, columns,
     * and rows all have the same sum
     * @return boolean
     */
    public boolean isMagicSquare() {
        int total = totalDiagonal(1);
        if(totalDiagonal(2) != total) {
            return false;
        }
        for(int a = 0; a < square.length; a++) {
            if(totalColumn(a) != total) {
                return false;
            }
        }
        for(int a = 0; a < square.length; a++) {
            if(totalRow(a) != total) {
                return false;
            }
        }
        return true;
    }
}