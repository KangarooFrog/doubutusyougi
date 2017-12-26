package doubutusyougi;

//座標にいるものが何なのか解析する
public class Discriminant {

	private int eaiResult;

	public int getEaiResult() {
		return eaiResult;
	}

	public void setEaiResult(int eaiResult) {
		this.eaiResult = eaiResult;
	}

	public int discriminant(MoveHand moveHand, Shogi_board board, CoordinateConversion cConversion,
			CapturedPiece capturedPiece ,MoveHandProcess moveHandProcess ) {



		// 味方がどうか判定 ひらがなかどうかで判定する
		// enemy_ally_identification 敵味方識別意味

		System.out.println();

		String eai = "";
		if (moveHand.getConvertPutMoveHand().equals("1") || moveHand.getConvertPutMoveHand().equals("2")
				|| moveHand.getConvertPutMoveHand().equals("3") || moveHand.getConvertPutMoveHand().equals("4")
				|| moveHand.getConvertPutMoveHand().equals("5") || moveHand.getConvertPutMoveHand().equals("6")
				|| moveHand.getConvertPutMoveHand().equals("7") || moveHand.getConvertPutMoveHand().equals("8")) {

			if(moveHandProcess.getSecond_flag() == 1) {

			eai = capturedPiece.getPieceInHandRow1()[Integer.parseInt(moveHand.getConvertPutMoveHand()) - 1];
			System.out.println("if文内のeai値:" + eai);
			System.out.println("parseIntの結果値" + moveHand.getConvertPutMoveHand());
			System.out.println("intger" + Integer.parseInt(moveHand.getConvertPutMoveHand()));
			System.out.println("1つ目の手ごまの配列値:" + capturedPiece.getPieceInHandRow1()[0]);
			}else if (moveHandProcess.getSecond_flag() == 2){

				eai = capturedPiece.getPieceInHandRow2()[Integer.parseInt(moveHand.getConvertPutMoveHand()) - 1];
				System.out.println("if文内のeai値:" + eai);
				System.out.println("parseIntの結果値" + moveHand.getConvertPutMoveHand());
				System.out.println("intger" + Integer.parseInt(moveHand.getConvertPutMoveHand()));
				System.out.println("1つ目の手ごまの配列値:" + capturedPiece.getPieceInHandRow2()[0]);

			}else {System.out.println("手ごまを使おうとしたがフラグの値がおかしい");}

		} else if (moveHand.getConvertPutMoveHand().equals("1,1") || moveHand.getConvertPutMoveHand().equals("1,2")
				|| moveHand.getConvertPutMoveHand().equals("1,3") || moveHand.getConvertPutMoveHand().equals("2,1")
				|| moveHand.getConvertPutMoveHand().equals("2,2") || moveHand.getConvertPutMoveHand().equals("2,3")
				|| moveHand.getConvertPutMoveHand().equals("3,1") || moveHand.getConvertPutMoveHand().equals("3,2")
				|| moveHand.getConvertPutMoveHand().equals("3,3") || moveHand.getConvertPutMoveHand().equals("4,1")
				|| moveHand.getConvertPutMoveHand().equals("4,2") || moveHand.getConvertPutMoveHand().equals("4,3")) {

			eai = board.getBoard()[cConversion.getMoveHandConversion()[cConversion.getInputMoveHandCount()]];
			System.out.println("if文内のeai値:" + eai);
			System.out.println("parseIntの結果値" + moveHand.getConvertPutMoveHand());

		} else {
			System.out.println("ifに入らなかった");
			System.out.println("if判定値:" + moveHand.getConvertPutMoveHand());
		}

		if (eai.matches("^[\\u3040-\\u309F]+$")) {
			System.out.println("1Pひらがなです。");
			eaiResult = 1;

		} else if (eai.matches("^[\\u30A0-\\u30FF]+$")) {
			System.out.println("2Pカタカナです。");
			eaiResult = 2;
		} else if (eai == "　") {
			System.out.println("空白スペース");
			eaiResult = 3;
		} else {
			System.out.println("システム上あり得ない値が入りました");
			System.out.println("打ち込みデータコンバート後:" + moveHand.getConvertPutMoveHand());
			System.out.println("判定値:" + eai);
			eaiResult = 0;
		}
		return eaiResult;
	}

}
