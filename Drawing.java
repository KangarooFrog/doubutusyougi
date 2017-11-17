package doubutusyougi;

//プレイ画面描写
public class Drawing {
	void draw(Fixed fixed, Shogi_board board, InputPlayerName inputName, CapturedPiece capturedPiece) {
		int count = -1;
		for (int i = 0; i <= 3; i++) {
			System.out.print(fixed.getBoardLineNo()[i] + "|");
			if (i == 3) {
				System.out.println();
			}
		}

		for (int i = 0; i <= 11; i++) {

			if (i == 0 || i % 3 == 0) {
				count++;
				System.out.print(fixed.getBoardArrayNo()[count] + "|");
			}

			System.out.print(board.getBoard()[i] + "|");

			if (i == 2 || i == 5 || i == 8 || i == 11) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.print(inputName.getPlayerName1() + "の持ち駒");

		//プレイヤーの名前によって表示場所調整
		for (int i = 6; i>=inputName.getPlayerName1().length(); i--) {
			System.out.print("　");
		}




		System.out.println(inputName.getPlayerName2() + "の持ち駒");
		System.out.println();

		for (int i = 0; i < 8; i++) {
			if (capturedPiece.getPieceInHandRow()[i] == '　') {
			} else {
				System.out.print(fixed.getCapturedPieceNo()[i]);
			}
		}

		System.out.print("　　　");

		for (int i = 0; i < 8; i++) {
			if (capturedPiece.getPieceInHandRow2()[i] == '　') {
			} else {
				System.out.print(fixed.getCapturedPieceNo()[i]);
			}
		}
		System.out.println();

		for (int i = 0; i < 8; i++) {
			if (capturedPiece.getPieceInHandRow()[i] == '　') {
			} else {
				System.out.print(capturedPiece.getPieceInHandRow()[i]);
			}
		}

		System.out.print("　　　");

		for (int i = 0; i < 8; i++) {
			if (capturedPiece.getPieceInHandRow2()[i] == '　') {
			} else {
				System.out.print(capturedPiece.getPieceInHandRow2()[i]);
			}
		}

	}
}
