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

		// タイトル画面
		titleInput.inputNmae(inputName, firstSecond);

		// 初期設定
		iniset.doInitialSetting(fixed, board, titleInput, capturedPiece);

		// 一番最初の描写
		draw.draw(fixed, board, inputName, capturedPiece);

		// 入力座標(移動したい駒)をどう処理するか判断する入力してほしくないものなら入力ループ
		moveHandProcess.moveFormerHandProcess(
				moveHand,
				board, cConversion,
				discriminant,
				cCiscriminant,
				firstSecond,
				moveHandProcess);

	//	 入力座標(移動先の座標)をどう処理するか判断する 入力してほしくないものなら入力ループ

		 moveHandProcess.moveTargetHandProcess(moveHand
		 , board
		 , cConversion
		 , discriminant
		 , cCiscriminant
		 , firstSecond
		 ,moveHandProcess);
		 }
}