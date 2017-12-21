package doubutusyougi.piece;

import doubutusyougi.CoordinateConversion;
import doubutusyougi.Shogi_board;


public class Chic{

	public Boolean discriminantMovableChic(CoordinateConversion cConversion, Shogi_board board) {

		Boolean tureFalse = false;

		// 移動元の駒がひらがなの場合
		if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u3040-\\u309F]+$")) {
			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -3) {
				tureFalse = true;

				System.out.println("ひよこは前進する(プレイヤー１ ひらがな");
			} else {
				System.out.println("移動できない");
				tureFalse = false;
			}

		}else if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u30A0-\\u30FF]+$")){
			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 3) {
				tureFalse = true;

				System.out.println("ヒヨコは前進する(プレイヤー2 カタカナ");
			} else {
				System.out.println("移動できない");
				tureFalse = false;
		}
	}else {System.out.println("ひらがなでもカタカナでもないものが来た");}

		System.out.println(tureFalse);
		return tureFalse;
	}

}