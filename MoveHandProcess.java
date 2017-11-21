package doubutusyougi;


public class MoveHandProcess {

	private int fs=0;
	private int moveHandCount=0;

	//移動元座標処理
	public void moveFormerHandProcess(MoveHand moveHand
			 , Shogi_board board
			 , CoordinateConversion cConversion
			 , Discriminant discriminant
			 , CoordinateCiscriminant cCiscriminant
			 ,FirstSecond firstSecond
			 ,MoveHandProcess moveHandProcess){

		//プレイヤー1、プレイヤー2どちらが先行でも処理できるように改善

		//プレイヤー1ひらがなが、先攻の場合
		if(firstSecond.getFistSecond() == 1 ) {
			fs=1;
		}
		//プレイヤー2カタカナが、先攻の場合
		else if(firstSecond.getFistSecond() == 2) {
			fs=2;
		}
		else {
			System.out.println("値:1、プレイヤー１が先行");
			System.out.println("値:2、プレイヤー2が先行");
			System.out.println("値:??、値1,値2が入るようにしか作らないようにしてください");
			System.out.println("それでも直らない場合は、タイトル処理がコメントアウトされるので表示されます");
		}

		 int count = 0;
			do {
				count++;
				if (count > 1) {
					System.out.println(count);
					System.out.println("もう一度入力してください");
				}
				// 指し手入力
				moveHand.putAfterMoveHand(moveHand, board, cConversion, discriminant, cCiscriminant,moveHandProcess);
			} while (!(discriminant.getEaiResult() == fs));
				System.out.println("移動できます");
				moveHandCount++;
	 }

	// 移動先座標処理
	public void moveTargetHandProcess(MoveHand moveHand
									 , Shogi_board board
									 , CoordinateConversion cConversion
									 , Discriminant discriminant
									 , CoordinateCiscriminant cCiscriminant
									 , MoveHandProcess moveHandProcess) {


		PieceMotionDecision pieceMotionDecision= new PieceMotionDecision();



		int count = 0;
		do {
			count++;
			if (count > 1) {
				System.out.println(count);
				System.out.println("もう一度入力してください");
			}
			// 指し手入力
			moveHand.putAfterMoveHand(moveHand, board, cConversion, discriminant, cCiscriminant,moveHandProcess);
			System.out.println("ここまできているか");
			//ここから無限ループなう、カタカナ座標を入れるとnullぽするぞい
			//whileは、tureの時にdoをループする　絶対ここのループ文が間違っていると思われる
		} while (!(discriminant.getEaiResult() == fs)&&!(pieceMotionDecision.determineMotionPiece(cConversion, board)==true));
		System.out.println("移動できます");
	}

	public int getMoveHandCount() {
		return moveHandCount;
	}
}
