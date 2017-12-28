package doubutusyougi;

//将棋盤もしくは、うちゴマの座標ではない、ものが入力されたら再度打ち込みを促す
public class CoordinateCiscriminant {

	void cCiscriminant(MoveHand moveHand
			,Shogi_board board
			,CoordinateConversion  cConversion
			,Discriminant discriminant
			,CoordinateCiscriminant cCiscriminant
			,MoveHandProcess moveHandProcess
			,CapturedPiece capturedPiece
			,FirstSecond firstSecond
			) {
		String d = moveHand.getConvertPutMoveHand();
	if (("1,1".equals(d)||("1,2".equals(d)|| ("1,3".equals(d)) || ("2,1".equals(d)) || ("2,2".equals(d))
			|| ("2,3".equals(d)) ||("3,1".equals(d)) || ("3,2".equals(d)) || ("3,3".equals(d))
			|| ("4,1".equals(d)) || ("4,2".equals(d)) || ("4,3".equals(d)) || ("4,4".equals(d))
				|| ("1".equals(d)) || ("2".equals(d)) || ("3".equals(d)) || ("4".equals(d)) || ("5".equals(d))
				|| ("6".equals(d)) || ("7".equals(d)) || ("8".equals(d)))))
				 {
			cConversion.cConversion(moveHand,board,cConversion,discriminant,moveHandProcess,capturedPiece,firstSecond);
				 }
			else {
			moveHand.putAfterMoveHand(moveHand, board,cConversion,discriminant,cCiscriminant,moveHandProcess,capturedPiece,firstSecond);
		}
	}

}
