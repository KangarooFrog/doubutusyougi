package doubutusyougi;

//座標変換
public class CoordinateConversion {
	// フィールドにプリミティブ型の変数が初期値をしていいない場合は、0で入るよ
	// 参照型はnullが入るよ
	// 移動元座標変換後に、moveHandConversion[0]
	// 移動先座標変換後に、moveHandConversion[1]
	private int[] moveHandConversion = new int[2];
	// 持ち駒用
	private int PossessionMoveHandConversion;
	// 指し手をカウントする
	private int inputMoveHandCount = 0;
	// 座標入力を処理しやすい形にする

	public void cConversion(MoveHand moveHand, Shogi_board board, CoordinateConversion cConversion,
			Discriminant discriminant, MoveHandProcess moveHandProcess) {


		// 移動元を入力したかどうか



		int i = 0;

		if (i==0 ||i%2==0) {
			inputMoveHandCount = 0;
		}else if(i==1 || i%2==1){
			inputMoveHandCount = 1;
		}else {System.out.println("0or1以外が入ってきた");}

		System.out.println("座標表示:" + moveHand.getConvertPutMoveHand());
		switch (moveHand.getConvertPutMoveHand()) {
		case "1,1":
			moveHandConversion[i] = 0;
			i++;
			break;
		case "1,2":
			moveHandConversion[i] = 1;
			i++;
			break;
		case "1,3":
			moveHandConversion[i] = 2;
			i++;
			break;
		case "2,1":
			moveHandConversion[i] = 3;
			i++;
			break;
		case "2,2":
			moveHandConversion[i] = 4;
			i++;
			break;
		case "2,3":
			moveHandConversion[i] = 5;
			i++;
			break;
		case "3,1":
			moveHandConversion[i] = 6;
			i++;
			break;
		case "3,2":
			moveHandConversion[i] = 7;
			System.out.println("通っているか");
			System.out.println("i="+i);
			System.out.println(moveHandConversion[0] );
			System.out.println(moveHandConversion[1] );
			i++;
			break;
		case "3,3":
			moveHandConversion[i] = 8;
			i++;
			break;
		case "4,1":
			moveHandConversion[i] = 9;
			i++;
			break;
		case "4,2":
			moveHandConversion[i] = 10;
			i++;
			break;
		case "4,3":
			moveHandConversion[i] = 11;
			i++;
			break;
		// 取った駒の座標変換(持ち駒）
		case "1":
			PossessionMoveHandConversion = 12;
			break;
		case "2":
			PossessionMoveHandConversion = 13;
			break;
		case "3":
			PossessionMoveHandConversion = 14;
			break;
		case "4":
			PossessionMoveHandConversion = 15;
			break;
		case "5":
			PossessionMoveHandConversion = 16;
			break;
		case "6":
			PossessionMoveHandConversion = 17;
			break;
		case "7":
			PossessionMoveHandConversion = 18;
			break;
		case "8":
			PossessionMoveHandConversion = 19;
			break;
		}

		// 座標に何があるか判定
		discriminant.discriminant(moveHand, board, cConversion);

	}

	public int getPossessionMoveHandConversion() {
		return PossessionMoveHandConversion;
	}

	public int[] getMoveHandConversion() {
		System.out.println("元の座標の値:" + moveHandConversion[0]);
		System.out.println("移動先の座標の値:" + moveHandConversion[1]);
		return moveHandConversion;
	}

	public int getInputMoveHandCount() {
		return inputMoveHandCount;
	}

}
