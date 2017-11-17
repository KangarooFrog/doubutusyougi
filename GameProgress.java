package doubutusyougi;
//ゲーム全体進行
public class GameProgress {
	public static void main(String[] args ){
		InitialSetting iniset = new InitialSetting();
		Fixed fixed = new Fixed ();
		Drawing draw= new Drawing();
		Shogi_board board = new Shogi_board();
		Title titleInput = new Title();
		CapturedPiece capturedPiece = new CapturedPiece();
		InputPlayerName inputName =new InputPlayerName();
		FirstSecond firstSecond = new FirstSecond();
		MoveHand moveHand = new MoveHand ();



		//タイトル画面
		titleInput.inputNmae(inputName,firstSecond);

		//初期設定
		iniset.doInitialSetting(fixed,board,titleInput,capturedPiece);

		//一番最初の描写
		draw.draw(fixed,board,inputName,capturedPiece);

		//指し手
		moveHand.putAfterMoveHand();

	}
}

