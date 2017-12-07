package doubutusyougi;

import doubutusyougi.piece.Chick;

public class PieceMotionDecision {
	// 移動できない時は、flseで返して、移動できるときは、tureで返すようにしたい
	// メソッドの中身は、入力された移動元の駒の種類を判別して、駒ごとに、
	// 動けるかどうかを判定する。
	public Boolean determineMotionPiece(CoordinateConversion cConversion, Shogi_board board) {
		System.out.println("駒チェックメソッド起動");
		Boolean determineMotionPiece = null;

		Chick chick = new Chick();
		if (board.getBoard()[cConversion.getMoveHandConversion()[0]] == "ひ"
				|| board.getBoard()[cConversion.getMoveHandConversion()[0]] == "ヒ") {

			determineMotionPiece = chick.discriminantMovableChicken(cConversion, board);
			System.out.println(determineMotionPiece);
		}

		return determineMotionPiece;

		// 仮 MoveHandProcessから読んでるマン
	}

}
