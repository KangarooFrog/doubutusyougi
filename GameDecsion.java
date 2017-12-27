package doubutusyougi;

public class GameDecsion {

	boolean gameDecsion;

	public void gameDecsion(CapturedPiece capturedPiece) {
		for (int i = 0; i <= 7; i++) {
			if (capturedPiece.getPieceInHandRow1()[i].equals("ら")
					|| capturedPiece.getPieceInHandRow2()[i].equals("ラ")) {
				System.out.println("終了");
				gameDecsion = true;
			}
		}
	}

	public boolean getgameDecsion() {
		return gameDecsion;
	}
}
