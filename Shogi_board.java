package doubutusyougi;
//盤面の一次元駒の配列　
public class Shogi_board {
	private char[] board = new char[12];

	public char[] getBoard() {
		return board;
	}

	public void setBoard(char[] board) {
		this.board = board;
	}

}
