package doubutusyougi.piece;

import doubutusyougi.CoordinateConversion;
import doubutusyougi.Shogi_board;

public class Chicken {
	public Boolean discriminantMovableChicken(CoordinateConversion cConversion, Shogi_board board) {

		Boolean tureFalse = false;

		// 移動元の駒がひらがなの場合
		if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u3040-\\u309F]+$")) {

			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -4
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -3
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -2
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -1
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 1
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 3) {
				tureFalse = true;

				System.out.println("にわとりは前進するぞ(プレイヤー１ ひらがな");
			} else {
				System.out.println("移動できない");
				tureFalse = false;
			}
		} else if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u30A0-\\u30FF]+$")) {
			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -3
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -1
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 1
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 2
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 3
					|| cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == 4) {
				tureFalse = true;

				System.out.println("にわとりは前進するぞ(プレイヤー2 カタカナ");
			} else {
				System.out.println("移動できない");
				tureFalse = false;
			}

		}
		System.out.println(tureFalse);
		return tureFalse;
	}
}