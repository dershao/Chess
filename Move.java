
public class Move {
	private Pieces piece;
	private char column;
	private int row;
	
	//This would be replaced by the Piece class
	public static enum Pieces {
		PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING;
	}
	private static final char[] validColumns = {'a','b','c','d','e','f','g','h'};
	
	public Move(Pieces piece, char column, int row) {
		this.piece = piece;
		this.column = 'z';
		for (int i = 0; i < validColumns.length; i++) {
			if (validColumns[i] == column) {
				this.column = column;
			}
		}
		if (row > 0 && row < 9) {
			this.row = row;
		} else {
			this.row = 0;
		}
		
	}
	public boolean isValid() {
		if (column == 'z' || row == 0) {
			return false;
		} else {
			return true;
		}
	}
	public String showMove() {
		char toDisplay;
		switch (piece) {
			case PAWN:
				toDisplay = ' ';
				break;
			case ROOK:
				toDisplay = 'R';
				break;
			case KNIGHT:
				toDisplay = 'N';
				break;
			case BISHOP:
				toDisplay = 'B';
				break;
			case QUEEN:
				toDisplay = 'Q';
				break;
			case KING:
				toDisplay = 'K';
				break;
			default:
				toDisplay = ' ';
				break;
		}
		return toDisplay + "" + column + "" + row;
	}
	public Pieces getPiece() {
		return piece;
	}
	public char getColumn() {
		return column;
	}
	public int getNumericColumn() {
		return Character.getNumericValue(column) - 9;
	}
	public int getRow() {
		return row;
	}
	
}
