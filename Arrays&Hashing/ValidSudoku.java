class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int x = 0; x < 9; x++){
            HashSet<Character> validateRow = new HashSet<Character>();
            HashSet<Character> validateCol = new HashSet<Character>(); 
            for(int y = 0; y < 9; y++){
                if(board[x][y] != '.'){
                    if(!validateRow.add(board[x][y])){
                        return false;
                    }
                }
                if(board[y][x] != '.'){
                    if(!validateCol.add(board[y][x])){
                        return false;
                    }
                }
            }
        }
        int col = 0;
        int row = 0;
        while(col < 3 && row < 3){
            HashSet<Character> validateBox = new HashSet<Character>();
            for(int x = 3*row; x < (row+1)*3; x++){
                for(int y = 3*col; y < (col+1)*3; y++){
                    if(board[x][y] != '.'){
                        if(!validateBox.add(board[x][y])){
                            return false;
                        }
                    }
                }
            }
            col++;
            if(col%3 == 0){
                col = 0;
                row++;
            }
        }
        
        return true;
    }
}
