package Test;

public class Test55 {
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if( board[i][j] == 1) {
                    if(i == 0) {
                        for(int k = j - 1; k < j + 2; k++) {
                            if(board[i][j] != 1) {   
                                board[i][j] = 2;
                            }
                            if(board[i + 1][j] != 1) {   
                                board[i + 1][j] = 2;
                            }
                        }
                    } else if(i == board.length - 1) {
                        for(int k = j - 1; k < j + 2; k++) {
                            if(board[i][j] != 1) {   
                                board[i][j] = 2;
                            }
                            if(board[i - 1][j] != 1) {   
                                board[i - 1][j] = 2;
                            }
                        }
                    } else {
                        for(int k = j - 1; k < j + 2; k++) {
                            if(board[i][j] != 1) {   
                                board[i][j] = 2;
                            }
                            if(board[i - 1][j] != 1) {   
                                board[i - 1][j] = 2;
                            }
                            if(board[i + 1][j] != 1) {   
                                board[i + 1][j] = 2;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 2 || board[i][j] == 1) {
                    answer++;
                }
            }
        }
	}
}//k로 바꿔야함
