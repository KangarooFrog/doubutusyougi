package doubutusyougi;

//将棋盤にある座標かどうか判別
public class CoordinateCiscriminant {

	void cCiscriminant(MoveHand moveHand
			,Shogi_board board
			,CoordinateConversion  cConversion
			,Discriminant discriminant
			,CoordinateCiscriminant cCiscriminant
			,MoveHandProcess moveHandProcess) {
		String d = moveHand.getConvertPutMoveHand();
		// 盤面以外の座標をはじく
	if (("1,1".equals(d)||("1,2".equals(d)|| ("1,3".equals(d)) || ("2,1".equals(d)) || ("2,2".equals(d))
			|| ("2,3".equals(d)) ||("3,1".equals(d)) || ("3,2".equals(d)) || ("3,3".equals(d))
			|| ("4,1".equals(d)) || ("4,2".equals(d)) || ("4,3".equals(d)) || ("4,4".equals(d))
				|| ("1".equals(d)) || ("2".equals(d)) || ("3".equals(d)) || ("4".equals(d)) || ("5".equals(d))
				|| ("6".equals(d)) || ("7".equals(d)) || ("8".equals(d)))))
				 {
			System.out.println("正常座標"+d);
			//座標変換
			cConversion.cConversion(moveHand,board,cConversion,discriminant,moveHandProcess);
				 }
			else {
			System.out.println("不正座標:"+d);
			moveHand.putAfterMoveHand(moveHand, board,cConversion,discriminant,cCiscriminant,moveHandProcess);
		}
	}

}
