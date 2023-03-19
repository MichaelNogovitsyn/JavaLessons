import java.util.ArrayList;

/* 3. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
И вывести Доску.
Пример вывода доски 8x8

0x000000
0000x000
00x00000 
*/

public class test {

    public static void printMatrix(char[][] matrix) {
        int n = 8;
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println();
        }
    }
         
    public static void main(String[] args) {
        int N = 8;
        char[][] board = new char[N ][N ];        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '0';
            }
        }
        board[0][0] = 'X';
        board[1][2] = 'X';
        board[2][4] = 'X';
        board[3][6] = 'X';
        board[4][1] = 'X';
        board[5][3] = 'X';
        board[6][5] = 'X';
        board[7][7] = 'X';
        printMatrix(board);
    }

}