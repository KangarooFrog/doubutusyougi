package doubutusyougi;
//取った駒を保持
public class CapturedPiece {

	private String[] pieceInHandRow1 = new String[8];
	private String[] pieceInHandRow2 = new String[8];



	public String[] getPieceInHandRow1() {
		return pieceInHandRow1;
	}
	public void setPieceInHandRow1(String[] pieceInHandRow) {
		this.pieceInHandRow1 = pieceInHandRow;
	}
	public String[] getPieceInHandRow2() {
		return pieceInHandRow2;
	}
	public void setPieceInHandRow2(String[] pieceInHandRow2) {
		this.pieceInHandRow2 = pieceInHandRow2;
	}


}
