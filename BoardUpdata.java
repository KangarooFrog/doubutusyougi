package doubutusyougi;

public class BoardUpdata {

	public void boardUpdata(FirstSecond firstSecond, CoordinateConversion cConversion, Shogi_board board,
			CapturedPiece capturedPiece, MoveHandProcess moveHandProcess) {

		HiraganaConversion hiraganaConversion = new HiraganaConversion();
		KatakanaConversion katakanaConversion = new KatakanaConversion();

		// 移動先に、ひらがなの駒がある場合(つまりプレイヤー2の手番の時)
		if (board.getBoard()[cConversion.getMoveHandConversion()[1]].matches("^[\\u3040-\\u309F]+$")) {
			// 持ち駒が入っていないところに入れる
			for (int i = 0; i <= 7; i++) {
				if (capturedPiece.getPieceInHandRow2()[i] == "　") {
					capturedPiece.getPieceInHandRow2()[i] = hiraganaConversion
							.ganaToKana(board.getBoard()[cConversion.getMoveHandConversion()[1]]);
					i = 8;
				} else {
					System.out.println("おかしな持ち駒に入れようとしている？");
				}
			}
		} else if (board.getBoard()[cConversion.getMoveHandConversion()[1]].matches("^[\\u30A0-\\u30FF]+$")) {
			// 持ち駒が入っていないところに入れる
			for (int i = 0; i <= 7; i++) {
				if (capturedPiece.getPieceInHandRow1()[i] == "　") {
					capturedPiece.getPieceInHandRow1()[i] = katakanaConversion
							.kanaToGana(board.getBoard()[cConversion.getMoveHandConversion()[1]]);
					i = 8;
				} else {
					System.out.println("おかしな持ち駒に入れようとしている？");
				}
			}
		} else {
			System.out.println("ひらがなでもカタカナでもないものを入れようとしている");
			System.out.println("移動先の値:" + board.getBoard()[cConversion.getMoveHandConversion()[1]] + "←多分空白");

		}
		if (cConversion.getMoveHandConversion()[0] <= 11 && cConversion.getMoveHandConversion()[0] >= 0) {
			board.getBoard()[cConversion.getMoveHandConversion()[1]] = board
					.getBoard()[cConversion.getMoveHandConversion()[0]];
			board.getBoard()[cConversion.getMoveHandConversion()[0]] = "　";

		} else if (cConversion.getMoveHandConversion()[0] >= 12 && cConversion.getMoveHandConversion()[0] <= 19) {

			if (moveHandProcess.getSecond_flag() == 1) {
				board.getBoard()[cConversion.getMoveHandConversion()[1]] =
						capturedPiece.getPieceInHandRow2()[cConversion.getMoveHandConversion()[0]-12];
				capturedPiece.getPieceInHandRow2()[cConversion.getMoveHandConversion()[0]-12]="　";

			} else if (moveHandProcess.getSecond_flag() == 2) {
				board.getBoard()[cConversion.getMoveHandConversion()[1]] =
						capturedPiece.getPieceInHandRow1()[cConversion.getMoveHandConversion()[0]-12];
				capturedPiece.getPieceInHandRow1()[cConversion.getMoveHandConversion()[0]-12]="　";

			}

		}

	}
}