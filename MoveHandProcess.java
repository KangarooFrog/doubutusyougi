package doubutusyougi;

public class MoveHandProcess {

	private int second_flag = 0;


	public int getSecond_flag() {
		return second_flag;
	}

	/* 移動元座標処理
	 * FirstSecoundから現在の打ち手ではない打ち手の要素を作る(second_flag)
	 * 入力してほしくないものが来たら再ループさせる
	 */
	public void moveFormerHandProcess(MoveHand moveHand, Shogi_board board, CoordinateConversion cConversion,
			Discriminant discriminant, CoordinateCiscriminant cCiscriminant, FirstSecond firstSecond,
			MoveHandProcess moveHandProcess,CapturedPiece capturedPiece) {

		if (firstSecond.getFistSecond() == 1) {
			second_flag = 1;
		}
		else if (firstSecond.getFistSecond() == 2) {
			second_flag = 2;
		} else {
			System.out.println("値:1、プレイヤー１が先行");
			System.out.println("値:2、プレイヤー2が先行");
			System.out.println("値:??、値1,値2が入るようにしか作らないようにしてください");
			System.out.println("それでも直らない場合は、タイトル処理がコメントアウトされるので表示されます");
		}

		int count = 0;
		System.out.println("動かしたい駒の座標を入力してください");

		outside1: while (true) {
			count++;
			if (count > 1) {
				System.out.println("移動できません。");
				System.out.println("もう一度入力してください");
			}

			moveHand.putAfterMoveHand(moveHand, board, cConversion, discriminant, cCiscriminant, moveHandProcess,capturedPiece,firstSecond);
			if (discriminant.getEaiResult() == second_flag) {
				break outside1;
			}
		}
	}

	/*
	 * 移動先座標処理
	 * FirstSecoundから現在の打ち手ではない打ち手の要素を作る(second_flag)
	 * 入力してほしくないものが来たら再ループさせる
	 * 移動元の入力が今打ち手の駒であり、移動先には、移動できそうな座標なら次の処理に進む
	 *
	 * 反省点
	 * 移動先の座標処理だけで止めておけばよかった
	 */
	public void moveTargetHandProcess(MoveHand moveHand, Shogi_board board, CoordinateConversion cConversion,
			Discriminant discriminant, CoordinateCiscriminant cCiscriminant, FirstSecond firstSecond,
			MoveHandProcess moveHandProcess ,CapturedPiece capturedPiece) {

		PieceMotionDecision pieceMotionDecision = new PieceMotionDecision();

		boolean pM = false;
		if (firstSecond.getFistSecond() == 1) {
			second_flag = 2;
		}
		else if (firstSecond.getFistSecond() == 2) {
			second_flag = 1;
		}

		else {
			System.out.println("値:1、プレイヤー１が先行");
			System.out.println("値:2、プレイヤー2が先行");
			System.out.println("値:??、値1,値2が入るようにしか作らないようにしてください");
			System.out.println("それでも直らない場合は、タイトル処理がコメントアウトされるので表示されます");
		}

		int count = 0;
		for (;;) {
			count++;
			if (count > 1) {
				System.out.println("移動できません。");
				System.out.println("もう一度入力してください");
			}

			System.out.println("駒の移動先を座標で入力してください");
			moveHand.putAfterMoveHand(
					moveHand
					, board
					, cConversion
					, discriminant
					, cCiscriminant
					,moveHandProcess
					,capturedPiece
					, firstSecond

					);

			//次の移動元、移動先のチェック終了後の処理
			if (discriminant.getEaiResult() == second_flag || discriminant.getEaiResult() == 3) {
				pM = pieceMotionDecision.determineMotionPiece(cConversion, board, moveHandProcess);
			}
			if (pM)
				break;
		}
	}


}
