package interview;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo2 {
    /*
2. Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.
Input: board = [["X","X","X","X",X, O],
                ["X","O","O","O",X, X],
                ["X","X","O","X",O, O],
                ["X",'O',"X","X",X, O]]
Output:    [["X","X","X","X", O],
            ["X","X","X","X", X],
            ["X","X","X","X", O],
            ["X","O","X","X", O]]


index 'table_name_idx' (column, column2)




*/

}

class Solution {
    public static void main(String[] args) {
        char[][] matrix = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
        solve(matrix);
        for(char[] c: matrix)
        System.out.println(Arrays.toString(c));

    }

    public static void solve(char[][] board) {
        if (board == null || board.length <= 2 || board[0].length <= 2) return;
        int height = board.length;
        int width = board[0].length;
        //row
        for (int i = 0; i < width; i++) {
            if (board[0][i] == 'O')
                fill(board, 0, i);
            if (board[height - 1][i] == 'O')
                fill(board, height - 1, i);
        }
        //col
        for (int i = 0; i < height; i++) {
            if (board[i][0] == 'O')
                fill(board, i, 0);
            if (board[i][width - 1] == 'O')
                fill(board, i, width - 1);
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }

    private static void fill(char[][] board, int row, int col) {
        LinkedList<Integer> q = new LinkedList<>();
        int width = board[0].length;
        board[row][col] = '#';
        q.add(row * width + col);
        while (!q.isEmpty()) {
            Integer n = q.poll();
            int x = n / width;
            int y = n % width;
            if (x > 0) if (board[x - 1][y] == 'O') {
                board[x - 1][y] = '#';
                q.add((x - 1) * width + y);
            }
            if (y > 0) if (board[x][y - 1] == 'O') {
                board[x][y - 1] = '#';
                q.add(x * width + y - 1);
            }
            if (x < board.length - 1) if (board[x + 1][y] == 'O') {
                board[x + 1][y] = '#';
                q.add((x + 1) * width + y);
            }
            if (y < board[0].length - 1) if (board[x][y + 1] == 'O') {
                board[x][y + 1] = '#';
                q.add(x * width + y + 1);
            }
        }
    }
}