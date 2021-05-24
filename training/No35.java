//https://leetcode.com/problems/valid-sudoku/

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

public class No35 {
    public static boolean isValidSudoku(char[][] board) {
        int [] hChkArr = new int[9];
        int [] vChkArr = new int[9];
        int [] bChkArr = new int[9];
        for(int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int currentBit = 1 << board[i][j] - '0';
                if ((vChkArr[j] & currentBit) > 0 || (hChkArr[i] & currentBit) > 0 || (bChkArr[(i / 3) * 3 + j / 3] & currentBit) > 0) {
                    return false;
                }
                vChkArr[j] |= currentBit;
                hChkArr[i] |= currentBit;
                bChkArr[(i / 3) * 3 + j / 3] |= currentBit;
            }
        }
        return true;
    }

    public static void main (String []args) {
        char[][] board = new char[][]{
            {'7','.','.','.','4','.','.','.','.'},
            {'.','.','.','8','6','5','.','.','.'},
            {'.','1','.','2','.','.','.','.','.'},
            {'.','.','.','.','.','9','.','.','.'},
            {'.','.','.','.','5','.','5','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','2','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'}
            };
        isValidSudoku(board);
    }
}
