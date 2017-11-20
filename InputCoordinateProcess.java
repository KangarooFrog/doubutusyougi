package doubutusyougi;

//入力座標処理(最終結果)
public class InputCoordinateProcess {
	public void inputProcess(
			MoveHand moveHand
			,Shogi_board board
			, CoordinateConversion  cConversion
			, Discriminant discriminant
			,CoordinateCiscriminant cCiscriminant) {


		switch(discriminant.getEaiResult()){
		case 1:
			System.out.println("あなたが動かせる駒です。");
			break;
		case 2:
			moveHand.putAfterMoveHand(moveHand,board,cConversion,discriminant,cCiscriminant);
			break;
		case 0:moveHand.putAfterMoveHand(moveHand,board,cConversion,discriminant,cCiscriminant);
		}


	}
}
