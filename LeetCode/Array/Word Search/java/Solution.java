class Solution {
    public boolean exist(char[][] board, String word) {
        int index=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(index)){
                    if(back(i,j,board,word,index)){
                        return true;
                    }
                }
                
            }
        }
        return false;        
    }
    public boolean back(int i,int j,char[][] board,String word,int index){
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found =
                back(i + 1, j, board, word, index + 1) ||   
                back(i - 1, j, board, word, index + 1) ||   
                back(i, j + 1, board, word, index + 1) ||   
                back(i, j - 1, board, word, index + 1);     
        board[i][j] = temp;

        return found;
    }
}