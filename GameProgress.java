package doubutusyougi;

//ゲーム全体進行
public class GameProgress {
	public static void main(String[] args) {
		InitialSetting iniset = new InitialSetting();
		Fixed fixed = new Fixed();
		Drawing draw = new Drawing();
		Shogi_board board = new Shogi_board();
		Title titleInput = new Title();
		CapturedPiece capturedPiece = new CapturedPiece();
		InputPlayerName inputName = new InputPlayerName();
		FirstSecond firstSecond = new FirstSecond();
		MoveHand moveHand = new MoveHand();
		CoordinateConversion cConversion = new CoordinateConversion();
		Discriminant discriminant = new Discriminant();
		CoordinateCiscriminant cCiscriminant = new CoordinateCiscriminant();
		MoveHandProcess moveHandProcess = new MoveHandProcess();
		BoardUpdata boardUpdata = new BoardUpdata();
		GameDecsion gameDecsion = new GameDecsion();
		Turn_change turn_change = new Turn_change();

		// タイトル画面
		titleInput.inputNmae(inputName, firstSecond);

		// 初期設定
		iniset.doInitialSetting(fixed, board, titleInput, capturedPiece);

		// 一番最初の描写
		draw.draw(fixed, board, inputName, capturedPiece);

		//本ゲームのメソッドをゲームが終わるまでループさせる
		gameoutside: {
			while (true) {

				// 移動元の座標を正しく入力させる。
				moveHandProcess.moveFormerHandProcess(moveHand, board, cConversion, discriminant, cCiscriminant,
						firstSecond, moveHandProcess, capturedPiece);

				// 移動したい地点の座標を正しく入力させる。
				moveHandProcess.moveTargetHandProcess(moveHand, board, cConversion, discriminant, cCiscriminant,
						firstSecond, moveHandProcess, capturedPiece);

				// 入力した座標の結果と持ち駒を更新
				boardUpdata.boardUpdata(firstSecond, cConversion, board, capturedPiece, moveHandProcess);

				// 描写
				draw.draw(fixed, board, inputName, capturedPiece);

				// ゲーム終了条件
				gameDecsion.gameDecsion(capturedPiece);
				if (gameDecsion.getgameDecsion() == true) {
					break gameoutside;
				}

				//最後に打ち手の交代
				turn_change.turnChange(firstSecond);

			}
		}

		System.out.println("lionが取られました。");
		System.out.println("ゲーム終了です。");
		System.out.println("お疲れ様でした。");

	}
}
