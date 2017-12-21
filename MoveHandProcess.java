package doubutusyougi;


public class MoveHandProcess {

	private int second_flag=0;
	private int moveHandCount=0;

	//移動元座標処理
	public void moveFormerHandProcess(MoveHand moveHand
			 , Shogi_board board
			 , CoordinateConversion cConversion
			 , Discriminant discriminant
			 , CoordinateCiscriminant cCiscriminant
			 ,FirstSecond firstSecond
			 ,MoveHandProcess moveHandProcess){


		//他のクラスで定義した方がよかった
		//プレイヤー1ひらがなが、先攻の場合
		if(firstSecond.getFistSecond() == 1 ) {
			second_flag=1;
		}
		//プレイヤー2カタカナが、先攻の場合
		else if(firstSecond.getFistSecond() == 2) {
			second_flag=2;
		}
		else {
			System.out.println("値:1、プレイヤー１が先行");
			System.out.println("値:2、プレイヤー2が先行");
			System.out.println("値:??、値1,値2が入るようにしか作らないようにしてください");
			System.out.println("それでも直らない場合は、タイトル処理がコメントアウトされるので表示されます");
		}


		 int count = 0;
		 //入力した座標にある駒が動かせなかった時再入力を促す。
			do {
				count++;
				if (count > 1) {
					System.out.println("移動できません。");
					System.out.println("もう一度入力してください");
				}
				// 指し手入力
				System.out.println("動かしたい駒の座標を入力してください");
				moveHand.putAfterMoveHand(moveHand, board, cConversion, discriminant, cCiscriminant,moveHandProcess);
				} while (!(discriminant.getEaiResult() == second_flag));
				System.out.println("入力した座標の駒は、移動できます");
				moveHandCount++;
	 }

	// 移動先座標処理
	public void moveTargetHandProcess(MoveHand moveHand
									 , Shogi_board board
									 , CoordinateConversion cConversion
									 , Discriminant discriminant
									 , CoordinateCiscriminant cCiscriminant
									 ,FirstSecond firstSecond
									 , MoveHandProcess moveHandProcess) {


		PieceMotionDecision pieceMotionDecision= new PieceMotionDecision();

		boolean pM = false;
		//プレイヤー1、プレイヤー2どちらが先行でも処理できるように改善
		//プレイヤー1ひらがなが、先攻の場合
		if(firstSecond.getFistSecond() == 1 ) {
			second_flag=2;
		}
		//プレイヤー2カタカナが、先攻の場合
		else if(firstSecond.getFistSecond() == 2) {
			second_flag=1;
		}

		else {
			System.out.println("値:1、プレイヤー１が先行");
			System.out.println("値:2、プレイヤー2が先行");
			System.out.println("値:??、値1,値2が入るようにしか作らないようにしてください");
			System.out.println("それでも直らない場合は、タイトル処理がコメントアウトされるので表示されます");
		}

		int count = 0;
		for(;;) {
			count++;
			if (count > 1) {
				System.out.println("移動できません。");
				System.out.println("もう一度入力してください");
			}

			System.out.println("駒の移動先を座標で入力してください");
			// 指し手入力
			moveHand.putAfterMoveHand(moveHand, board, cConversion, discriminant, cCiscriminant,moveHandProcess);


			//System.out.println(second_flag);
			// 1 ひらがな 2カタカナ 3空白 4エラー
			if (discriminant.getEaiResult() == second_flag
					|| discriminant.getEaiResult() ==3)
			{
				//駒が動けるかどうか判定
				pM=pieceMotionDecision.determineMotionPiece(cConversion, board);
				//System.out.println(pM);
			}
			if(pM)break;
		}

		System.out.println("移動します。");

	}

	public int getMoveHandCount() {
		return moveHandCount;
	}
}
