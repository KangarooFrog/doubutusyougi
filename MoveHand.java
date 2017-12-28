package doubutusyougi;

import java.util.Scanner;

//駒の座標を打ち込み、座標を保持する
public class MoveHand {

	private String convertPutMoveHand;

	public void putAfterMoveHand(
			MoveHand moveHand
			,Shogi_board board
			, CoordinateConversion  cConversion
			, Discriminant discriminant
			,CoordinateCiscriminant cCiscriminant
			,MoveHandProcess moveHandProcess
			,CapturedPiece capturedPiece
			,FirstSecond firstSecond
			) {
		Scanner scanner = new Scanner(System.in);
		convertPutMoveHand = scanner.next();
		cCiscriminant.cCiscriminant(moveHand, board,cConversion,discriminant,cCiscriminant,moveHandProcess,capturedPiece,firstSecond);
	}

	public String getConvertPutMoveHand() {

		return convertPutMoveHand;
	}

	public void setConvertPutMoveHand(String convertPutMoveHand) {
		this.convertPutMoveHand = convertPutMoveHand;
	}
}
