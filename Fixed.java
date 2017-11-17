package doubutusyougi;

//動物将棋を表示したときに必ず変わらない表示項目の配列を作る
public class Fixed {

	private String[] boardLineNo = new String[4];
	private char[] boardArrayNo = new char[4];
	private char[] capturedPieceNo = new char[8];





	public char[] getCapturedPieceNo() {
		return capturedPieceNo;
	}

	public void setCapturedPieceNo(char[] capturedPieceNo) {
		this.capturedPieceNo = capturedPieceNo;
	}

	public String[] getBoardLineNo() {
		return boardLineNo;
	}

	public void setBoardLineNo(String[] boardLineNo) {
		this.boardLineNo = boardLineNo;
	}

	public char[] getBoardArrayNo() {
		return boardArrayNo;
	}

	public void setBoardArrayNo(char[] boardArrayNo) {
		this.boardArrayNo = boardArrayNo;
	}

}
