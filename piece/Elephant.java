package doubutusyougi.piece;

import doubutusyougi.CoordinateConversion;
import doubutusyougi.Shogi_board;

public class Elephant {
	public Boolean discriminantMovableElephant(CoordinateConversion cConversion, Shogi_board board) {

		Boolean tureFalse = false;

		// 移動元の駒がひらがなの場合
		if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u3040-\\u309F]+$")
				||board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u30A0-\\u30FF]+$")) {


			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -4
					||cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -2
					||cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == +2
					||cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == +4) {

				tureFalse = true;
			} else {
				System.out.println("移動できない");
				tureFalse = false;
			}
		}
		System.out.println(tureFalse);
		return tureFalse;
	}
}
