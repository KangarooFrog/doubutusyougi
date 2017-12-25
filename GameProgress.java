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

		gameoutside: {
			while (true) {

				// 入力座標(移動したい駒)をどう処理するか判断する入力してほしくないものなら入力ループ
				moveHandProcess.moveFormerHandProcess(moveHand, board, cConversion, discriminant, cCiscriminant,
						firstSecond, moveHandProcess, capturedPiece);

				// 入力座標(移動先の座標)をどう処理するか判断する 入力してほしくないものなら入力ループ
				moveHandProcess.moveTargetHandProcess(moveHand, board, cConversion, discriminant, cCiscriminant,
						firstSecond, moveHandProcess, capturedPiece);

				// 入力した座標を盤面に反映させる
				// 持ち駒も更新

				boardUpdata.boardUpdata(firstSecond, cConversion, board, capturedPiece);

				// 盤面更新と持ち駒を更新
				draw.draw(fixed, board, inputName, capturedPiece);

				// lionがとられたかどうか（勝負が決まったかどうか)
				gameDecsion.gameDecsion(capturedPiece);
				if (gameDecsion.getgameDecsion() == true) {
					break gameoutside;
				}
				//内手の順番替え
				turn_change.turnChange(firstSecond);

			}
		}

		System.out.println("lionが取られました。");
		System.out.println("ゲーム終了です。");
		System.out.println("お疲れ様でした。");

	}
}
