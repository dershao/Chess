
public class Board {

	Piece[][] board;
	public static void main(String[] args) {

	}
	
	public Board() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = new Piece();
			}
		}
		
	}

}
