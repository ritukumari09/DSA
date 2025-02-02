public class wordSearch {
    class Solution {
        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == word.charAt(0) && backtrack(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }
        private boolean backtrack(char[][] board, String word, int row, int col, int index) {
            if (index == word.length()) {
                return true;
            }
            if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
                return false;
            }
            char temp = board[row][col];
            board[row][col] = '#';
            boolean found = backtrack(board, word, row - 1, col, index + 1) || 
                            backtrack(board, word, row + 1, col, index + 1) || 
                            backtrack(board, word, row, col - 1, index + 1) || 
                            backtrack(board, word, row, col + 1, index + 1);
            board[row][col] = temp;
            return found;
        }
    }
}
/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true */
