package doubutusyougi;

//タイトル画面
public class Title {

	void inputNmae(InputPlayerName inputName,FirstSecond firstSecond) {
			System.out.println("動物将棋");
			System.out.print("\r");
			System.out.print("\r");
			System.out.print("\r");
			inputName.InputName();

		for (int i = 0; i < 20; i++) {
			System.out.print("\r");
		}
		System.out.print("先攻プレイヤーは、");
		if(firstSecond.decideFirstSecont() ==1) {
			System.out.println(inputName.getPlayerName1());
		}else {System.out.println(inputName.getPlayerName2());}
		System.out.println();

	}



}
