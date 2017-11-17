package doubutusyougi;

import java.util.Scanner;
//プレイヤーネーム入力
public class InputPlayerName {

	private String playerName1;
	private String playerName2;

	void InputName() {

		//全角四文字で入力させる
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		do {
			count = 0;
			System.out.println("全角、四文字以下でプレイヤー1名を入力してください");
			playerName1 = scanner.nextLine();
			for (int i = 0; i < playerName1.length(); i++) {
				char c = playerName1.charAt(i);
				if ((c <= '\u007e') || // 英数字
						(c == '\u00a5') || // \記号
						(c == '\u203e') || // ~記号
						(c >= '\uff61' && c <= '\uff9f') // 半角カナ
				)
					count++;
			}
		} while (playerName1.length() > 5 || count > 0);

		//全角四文字で入力させる
		int count2 = 0;
		do {
			count = 0;
			System.out.println("全角、四文字以下でプレイヤー2名を入力してください");
			playerName2 = scanner.nextLine();
			for (int i = 0; i < playerName2.length(); i++) {
				char c = playerName2.charAt(i);
				if ((c <= '\u007e') || // 英数字
						(c == '\u00a5') || // \記号
						(c == '\u203e') || // ~記号
						(c >= '\uff61' && c <= '\uff9f') // 半角カナ
				)
					count2++;
			}
		} while (playerName2.length() > 5 || count2 > 0);

	}

	public String getPlayerName1() {

		return playerName1;
	}

	public String getPlayerName2() {
		return playerName2;
	}
}
