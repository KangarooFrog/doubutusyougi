package doubutusyougi.piece;

import doubutusyougi.CoordinateConversion;
import doubutusyougi.Shogi_board;

public class Giraffe {
	public Boolean discriminantMovableGiraffe(CoordinateConversion cConversion, Shogi_board board) {

		Boolean tureFalse = false;


		if (board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u3040-\\u309F]+$")
				||board.getBoard()[cConversion.getMoveHandConversion()[0]].matches("^[\\u30A0-\\u30FF]+$")) {

			int test =cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0];
			System.out.println("きりんの計算"+test);


			if (cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -3
					||cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == -1
					||cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == +1
					||cConversion.getMoveHandConversion()[1] - cConversion.getMoveHandConversion()[0] == +3) {

				tureFalse = true;

				System.out.println("キリンは移動する");
			} else {
				System.out.println("移動できない");
				tureFalse = false;
			}
		}
		//System.out.println(tureFalse);
		return tureFalse;
	}
}
