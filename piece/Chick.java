package doubutusyougi.piece;

import doubutusyougi.CoordinateConversion;
import doubutusyougi.Shogi_board;

//小鳥
public class Chick {

	public Boolean discriminantMovableChicken(CoordinateConversion cConversion, Shogi_board board) {
		Boolean tureFalse = false;
		// 移動元の駒がひらがなの場合
		if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u3040-\\u309F]+$")) {

			// 移動先-移動元=3の場合チキンは移動するぞ(プレイヤー1ひらがなの場合)
			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -3) {
				tureFalse = true;
				System.out.println("チキンは前進するぞ(プレイヤー１ ひらがな");
			} else
				System.out.println("移動できない");
				tureFalse = false;
		}
		return tureFalse;
	}
}