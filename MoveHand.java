package doubutusyougi;

//昨日やったところ、ここを考える前に、座標入力のバリデーションエラーについて考える必要がある
import java.util.Scanner;

public class MoveHand {


	private String convertPutAfterMoveHand;
	private String convertedPutAfterMoveHand;

	private String convertPutBeforeMoveHand;
	private String convertedPutBeforeMoveHand;



	 	void putAfterMoveHand() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("うえええええええええええええい");
		String d;

		System.out.println("動かしたい駒の座標を入力してください");

		//盤面以外の座標をはじく
		do {
			System.out.println("盤面の座標もしくは、持ち駒の座標を入力してください");
			convertPutAfterMoveHand = scanner.nextLine();
			d = convertPutAfterMoveHand;
		} while (

		!("1,1".equals(d)) && !("1,2".equals(d)) && !("1,3".equals(d)) || !("2,1".equals(d)) || !("2,2".equals(d))
				&& !("2,3".equals(d)) && !("3,1".equals(d)) && !("3,2".equals(d)) && !("3,3".equals(d))
				&& !("4,1".equals(d)) && !("4,2".equals(d)) && !("4,3".equals(d)) && !("4,4".equals(d))
				&& !("1".equals(d)) && !("2".equals(d)) && !("3".equals(d)) && !("4".equals(d)) && !("5".equals(d))
				&& !("6".equals(d)) && !("7".equals(d)) && !("8".equals(d)));
		System.out.println(d);
		scanner.close();

		switch (convertPutAfterMoveHand) {
		case "1,1":
			convertedPutAfterMoveHand = "0";
			break;
		case "1,2":
			convertedPutAfterMoveHand = "1";
			break;
		case "1,3":
			convertedPutAfterMoveHand = "2";
			break;
		case "2,1":
			convertedPutAfterMoveHand= "3";
			break;
		case "2,2":
			convertedPutAfterMoveHand = "4";
			break;
		case "2,3":
			convertedPutAfterMoveHand = "5";
			break;
		case "3,1":
			convertedPutAfterMoveHand = "6";
			break;
		case "3,2":
			convertedPutAfterMoveHand = "7";
			break;
		case "3,3":
			convertedPutAfterMoveHand = "8";
			break;
		case "4,1":
			convertedPutAfterMoveHand = "9";
			break;
		case "4,2":
			convertedPutAfterMoveHand = "10";
			break;
		case "4,3":
			convertedPutAfterMoveHand=  "11";
			break;

		}System.out.println("convertPutAfterMoveHand"+convertPutAfterMoveHand);
		System.out.println("convertedPutAfterMoveHand"+convertedPutAfterMoveHand);

	}

	public 	void putBeforeMoveHand() {

		Scanner scanner = new Scanner(System.in);

		String d;

		convertPutBeforeMoveHand = scanner.nextLine();

		System.out.println("動かしたい駒の座標を入力してください");

		//盤面以外の座標をはじく
		do {
			System.out.println("盤面の座標もしくは、持ち駒の座標を入力してください");
			convertPutBeforeMoveHand= scanner.nextLine();
			d = convertPutBeforeMoveHand;
		} while (

				!("1,1".equals(d)) && !("1,2".equals(d)) && !("1,3".equals(d)) || !("2,1".equals(d)) || !("2,2".equals(d))
				&& !("2,3".equals(d)) && !("3,1".equals(d)) && !("3,2".equals(d)) && !("3,3".equals(d))
				&& !("4,1".equals(d)) && !("4,2".equals(d)) && !("4,3".equals(d)) && !("4,4".equals(d))
				&& !("1".equals(d)) && !("2".equals(d)) && !("3".equals(d)) && !("4".equals(d)) && !("5".equals(d))
				&& !("6".equals(d)) && !("7".equals(d)) && !("8".equals(d)));
		System.out.println(d);
		scanner.close();

		switch (convertPutBeforeMoveHand) {
		case "1,1":
			convertedPutBeforeMoveHand= "0";
			break;
		case "1,2":
			convertedPutBeforeMoveHand = "1";
			break;
		case "1,3":
			convertedPutBeforeMoveHand = "2";
			break;
		case "2,1":
			convertedPutBeforeMoveHand= "3";
			break;
		case "2,2":
			convertedPutBeforeMoveHand = "4";
			break;
		case "2,3":
			convertedPutBeforeMoveHand = "5";
			break;
		case "3,1":
			convertedPutBeforeMoveHand = "6";
			break;
		case "3,2":
			convertedPutBeforeMoveHand= "7";
			break;
		case "3,3":
			convertedPutBeforeMoveHand= "8";
			break;
		case "4,1":
			convertedPutBeforeMoveHand = "9";
			break;
		case "4,2":
			convertedPutBeforeMoveHand= "10";
			break;
		case "4,3":
			convertedPutBeforeMoveHand=  "11";
			break;

		}

	}

	public String getConvertPutAfterMoveHand() {
		return convertPutAfterMoveHand;
	}

	public String getConvertedPutAfterMoveHand() {
		return convertedPutAfterMoveHand;
	}

	public String getConvertPutBeforeMoveHand() {
		return convertPutBeforeMoveHand;
	}

	public String getConvertedPutBeforeMoveHand() {
		return convertedPutBeforeMoveHand;
	}


}
