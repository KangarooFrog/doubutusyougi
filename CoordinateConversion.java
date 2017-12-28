package doubutusyougi;

/*将棋盤のデータを保持している配列は一次元配列なので、
 *入力された座標を一次元配列用に数値を変換する
 */
public class CoordinateConversion {
	private int[] moveHandConversion = new int[2];

	// 指し手をカウントする
	private int inputMoveHandCount = 0;
	// 座標入力を処理しやすい形にする
	private int i=0;

	public void cConversion(MoveHand moveHand, Shogi_board board, CoordinateConversion cConversion,
			Discriminant discriminant, MoveHandProcess moveHandProcess , CapturedPiece capturedPiece,FirstSecond firstSecond
			) {


		// 移動元を入力したかどうか
		if (i==0 ||i%2==0) {
			inputMoveHandCount = 0;
		}else if(i==1 || i%2==1){
			inputMoveHandCount = 1;
		}else {System.out.println("0or1以外が入ってきた");}
		i++;

		switch (moveHand.getConvertPutMoveHand()) {
		case "1,1":
			moveHandConversion[inputMoveHandCount] = 0;
			break;
		case "1,2":
			moveHandConversion[inputMoveHandCount] = 1;
			break;
		case "1,3":
			moveHandConversion[inputMoveHandCount] = 2;
			break;
		case "2,1":
			moveHandConversion[inputMoveHandCount] = 3;
			break;
		case "2,2":
			moveHandConversion[inputMoveHandCount] = 4;
			break;
		case "2,3":
			moveHandConversion[inputMoveHandCount] = 5;
			break;
		case "3,1":
			moveHandConversion[inputMoveHandCount] = 6;
			break;
		case "3,2":
			moveHandConversion[inputMoveHandCount] = 7;
			break;
		case "3,3":
			moveHandConversion[inputMoveHandCount] = 8;
			break;
		case "4,1":
			moveHandConversion[inputMoveHandCount] = 9;
			break;
		case "4,2":
			moveHandConversion[inputMoveHandCount] = 10;
			break;
		case "4,3":
			moveHandConversion[inputMoveHandCount] = 11;
			break;

		// 取った駒の座標変換(持ち駒）
		case "1":
			moveHandConversion[inputMoveHandCount] =12;
			break;
		case "2":
			moveHandConversion[inputMoveHandCount] =13;
			break;
		case "3":
			moveHandConversion[inputMoveHandCount] =14;
			break;
		case "4":
			moveHandConversion[inputMoveHandCount] =15;
			break;
		case "5":
			moveHandConversion[inputMoveHandCount] =16;
			break;
		case "6":
			moveHandConversion[inputMoveHandCount] =17;
			break;
		case "7":
			moveHandConversion[inputMoveHandCount] =18;
			break;
		case "8":
			moveHandConversion[inputMoveHandCount] =19;
			break;
		}


		discriminant.discriminant(moveHand, board, cConversion ,capturedPiece,moveHandProcess );

	}



	public int[] getMoveHandConversion() {
		return moveHandConversion;
	}

	public int getInputMoveHandCount() {
		return inputMoveHandCount;
	}

}
