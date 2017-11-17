package doubutusyougi;
//取った駒を保持
public class CapturedPiece {

	private char[] pieceInHandRow = new char[8];
	private char[] pieceInHandRow2 = new char[8];



	public char[] getPieceInHandRow() {
		return pieceInHandRow;
	}
	public void setPieceInHandRow(char[] pieceInHandRow) {
		this.pieceInHandRow = pieceInHandRow;
	}
	public char[] getPieceInHandRow2() {
		return pieceInHandRow2;
	}
	public void setPieceInHandRow2(char[] pieceInHandRow2) {
		this.pieceInHandRow2 = pieceInHandRow2;
	}


}
