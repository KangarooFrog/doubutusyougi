package doubutusyougi;
//座標変換
public class CoordinateConversion {
	//フィールドにプリミティブ型の変数が初期値をしていいない場合は、0で入るよ
	//参照型はnullが入るよ
	//移動元座標変換後に、moveHandConversion[0]
	//移動先座標変換後に、moveHandConversion[1]
	private int[] moveHandConversion = new int[2];
	//持ち駒用
	private int PossessionMoveHandConversion;
	//指し手をカウントする
	private int  inputMoveHandCount= 0;

	//座標入力を処理しやすい形にする

	public void cConversion(MoveHand moveHand,Shogi_board board,CoordinateConversion cConversion,Discriminant discriminant,MoveHandProcess moveHandProcess ) {
		int i=0;
		//移動元を入力したかどうか
	if(moveHandProcess.getMoveHandCount()==1) {
		inputMoveHandCount=1;
	}
	i=inputMoveHandCount;
	switch (moveHand.getConvertPutMoveHand()) {
	case "1,1":
		moveHandConversion[i]=0;
		System.out.println("int型に変換されました:"+moveHand.getConvertPutMoveHand());
		break;
	case "1,2":
		moveHandConversion[i]=1;
		break;
	case "1,3":
		moveHandConversion[i]=2;
		break;
	case "2,1":
		moveHandConversion[i]=3;
		break;
	case "2,2":
		moveHandConversion[i]=4;
		break;
	case "2,3":
		moveHandConversion[i]=5;
		break;
	case "3,1":
		moveHandConversion[i]=6;
		break;
	case "3,2":
		moveHandConversion[i]=7;
		break;
	case "3,3":
		moveHandConversion[i]=8;
		break;
	case "4,1":
		moveHandConversion[i]=9;
		break;
	case "4,2":
		moveHandConversion[i]=10;
		break;
	case "4,3":
		moveHandConversion[i]=11;
		break;
//取った駒の座標変換
	case "1":
		PossessionMoveHandConversion=12;
		break;
	case "2":
		PossessionMoveHandConversion=13;
		break;
	case "3":
		PossessionMoveHandConversion=14;
		break;
	case "4":
		PossessionMoveHandConversion=15;
		break;
	case "5":
		PossessionMoveHandConversion=16;
		break;
	case "6":
		PossessionMoveHandConversion=17;
		break;
	case "7":
		PossessionMoveHandConversion=18;
		break;
	case "8":
		PossessionMoveHandConversion=19;
		break;
	}

	//座標に何があるか判定
	discriminant.discriminant(moveHand,board,cConversion);

	}

	public int getPossessionMoveHandConversion() {
		return PossessionMoveHandConversion;
	}

	public int[] getMoveHandConversion() {
		return moveHandConversion;
	}

	public int getInputMoveHandCount() {
		return inputMoveHandCount;
	}



}
