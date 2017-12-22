package doubutusyougi;

public class GameDecsion {

	boolean gameDecsion;

	public void gameDecsion(CapturedPiece capturedPiece) {

		for (int i = 0; i <= 7; i++) {

			if ((capturedPiece.getPieceInHandRow2()[i] == "ら")
					|| (capturedPiece.getPieceInHandRow2()[i] == "ラ")) {

				System.out.println("終了");
				gameDecsion = true;


			}
		}
	}


	public boolean getgameDecsion() {
		return gameDecsion;
	}
}
