package doubutusyougi;
//座標変換
public class CoordinateConversion {

	private int moveHandConversion;
	private int PossessionMoveHandConversion;

	//座標入力を処理しやすい形にする

	public void cConversion(MoveHand moveHand,Shogi_board board,CoordinateConversion cConversion,Discriminant discriminant ) {

	switch (moveHand.getConvertPutMoveHand()) {
	case "1,1":
		moveHandConversion=0;
		System.out.println("int型に変換されました:"+moveHand.getConvertPutMoveHand());
		break;
	case "1,2":
		moveHandConversion=1;
		break;
	case "1,3":
		moveHandConversion=2;
		break;
	case "2,1":
		moveHandConversion=3;
		break;
	case "2,2":
		moveHandConversion=4;
		break;
	case "2,3":
		moveHandConversion=5;
		break;
	case "3,1":
		moveHandConversion=6;
		break;
	case "3,2":
		moveHandConversion=7;
		break;
	case "3,3":
		moveHandConversion=8;
		break;
	case "4,1":
		moveHandConversion=9;
		break;
	case "4,2":
		moveHandConversion=10;
		break;
	case "4,3":
		moveHandConversion=11;
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
	discriminant.discriminant(moveHand,board,cConversion );

	}

	public int getPossessionMoveHandConversion() {
		return PossessionMoveHandConversion;
	}

	public int getMoveHandConversion() {
		return moveHandConversion;
	}
}
