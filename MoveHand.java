package doubutusyougi;

import java.util.Scanner;

//駒の座標を打ち込ませるだけ
public class MoveHand {

	private String convertPutMoveHand;

	public void putAfterMoveHand(MoveHand moveHand,Shogi_board board
			, CoordinateConversion  cConversion
			, Discriminant discriminant
			,CoordinateCiscriminant cCiscriminant
			,MoveHandProcess moveHandProcess) {
		System.out.println("動かしたい駒の座標を入力してください");

		Scanner scanner = new Scanner(System.in);
		convertPutMoveHand = scanner.next();

		//指して座標が本当に盤面に存在するか判定
		cCiscriminant.cCiscriminant(moveHand, board,cConversion,discriminant,cCiscriminant,moveHandProcess);
	}

	public String getConvertPutMoveHand() {
		return convertPutMoveHand;
	}

	public void setConvertPutMoveHand(String convertPutMoveHand) {
		this.convertPutMoveHand = convertPutMoveHand;
	}
}
