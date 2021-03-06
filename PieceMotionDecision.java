package doubutusyougi;

import doubutusyougi.piece.Chic;
import doubutusyougi.piece.Chicken;
import doubutusyougi.piece.Elephant;
import doubutusyougi.piece.Giraffe;
import doubutusyougi.piece.Lion;

public class PieceMotionDecision {

	// 入力した移動元の駒が入力した移動先に飛べるかどうかを調べる。
	public Boolean determineMotionPiece(CoordinateConversion cConversion, Shogi_board board,
			MoveHandProcess moveHandProcess) {
		Boolean determineMotionPiece = false;

		Chic chic = new Chic();
		Chicken chicken = new Chicken();
		Elephant elephant = new Elephant();
		Giraffe giraffe = new Giraffe();
		Lion lion = new Lion();

		if (cConversion.getMoveHandConversion()[0] <= 11 && cConversion.getMoveHandConversion()[0] >= 0) {
			switch (board.getBoard()[cConversion.getMoveHandConversion()[0]]) {
			case "ひ":
			case "ヒ":
				determineMotionPiece = chic.discriminantMovableChic(cConversion, board);
				break;
			case "ぞ":
			case "ゾ":
				determineMotionPiece = elephant.discriminantMovableElephant(cConversion, board);
				break;
			case "き":
			case "キ":
				determineMotionPiece = giraffe.discriminantMovableGiraffe(cConversion, board);
				break;
			case "ら":
			case "ラ":
				determineMotionPiece = lion.discriminantMovableLion(cConversion, board);
				break;
			case "に":
			case "二":
				determineMotionPiece = chicken.discriminantMovableChicken(cConversion, board);
				break;

			}
		} else if (cConversion.getMoveHandConversion()[0] >= 12 && cConversion.getMoveHandConversion()[0] <= 19) {
			if (board.getBoard()[cConversion.getMoveHandConversion()[1]] == "　") {
				determineMotionPiece = true;
			} else {
				determineMotionPiece = false;
			}

		} else {
			System.out.println("盤面と手ごま以外の値が入力された:" + cConversion.getMoveHandConversion()[0]);
		}
		return determineMotionPiece;

	}

}
