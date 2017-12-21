package doubutusyougi;
//動物将棋開始直後の初期設定
public class InitialSetting {
	void doInitialSetting(Fixed fixed,Shogi_board board,Title
			titleInput,CapturedPiece capturedPiece) {

		String[] boardLineIni = new String[4];
		char[] boardArrayIni = new char[4];
		String[] boardIni = new String[12];
		String[] pieceInHandIni =new String[9];
		String[] pieceInHandIni2 =new String[9];
		char[] capturedPieceNo =new char[9];


		boardLineIni[0] = "　";
		boardLineIni[1] = "一";
		boardLineIni[2] = "二";
		boardLineIni[3] = "三";

		boardArrayIni [0] = '１';
		boardArrayIni [1] = '２';
		boardArrayIni [2] = '３';
		boardArrayIni [3] = '４';


		boardIni [0] = "キ";
		boardIni [1] = "ラ";
		boardIni [2] = "ゾ";
		boardIni [3] = "　";
		boardIni [4] = "ヒ";
		boardIni [5] = "　";
		boardIni [6] = "　";
		boardIni [7] = "ひ";
		boardIni [8] = "　";
		boardIni [9] = "ぞ";
		boardIni [10] = "ら";
		boardIni [11] = "き";

		capturedPieceNo[0]= '１';
		capturedPieceNo[1]= '２';
		capturedPieceNo[2]= '３';
		capturedPieceNo[3]= '４';
		capturedPieceNo[4]= '５';
		capturedPieceNo[5]= '６';
		capturedPieceNo[6]= '７';
		capturedPieceNo[7]= '８';




		for(int i=0; i<9; i++) {
			pieceInHandIni[i] = "　";
		}
		//pieceInHandIni[4] ='　';

		for(int i=0; i<9; i++) {
			pieceInHandIni2[i] = "　";
		}
		//pieceInHandIni2[4] ='　';


		fixed.setBoardLineNo(boardLineIni);
		fixed.setBoardArrayNo(boardArrayIni);
		board.setBoard(boardIni);
		capturedPiece.setPieceInHandRow1(pieceInHandIni);
		capturedPiece.setPieceInHandRow2(pieceInHandIni2);
		fixed.setCapturedPieceNo(capturedPieceNo);


	}
}
