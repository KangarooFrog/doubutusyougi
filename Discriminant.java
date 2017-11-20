package doubutusyougi;

//座標にいるものが何なのか解析する
public class Discriminant {

	private int eaiResult;

	public void discriminant(MoveHand moveHand, Shogi_board board, CoordinateConversion cConversion) {
		System.out.println("入力した座標には、駒の配列:" + board.getBoard()[cConversion.getMoveHandConversion()] + "が存在します");

		// 味方がどうか判定 ひらがなかどうかで判定する
		// enemy_ally_identification 敵味方識別意味
		String eai = board.getBoard()[cConversion.getMoveHandConversion()];
		if (eai.matches("^[\\u3040-\\u309F]+$")) {
			System.out.println("1Pひらがなです。");
			eaiResult = 1;
		} else if (eai.matches("^[\\u30A0-\\u30FF]+$")) {
			System.out.println("2Pカタカナです。");
			eaiResult = 2;
		} else {
			System.out.println("空白スペース");
		}
		eaiResult = 0;
	}

	public int getEaiResult() {
		return eaiResult;
	}
}
