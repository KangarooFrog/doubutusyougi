package doubutusyougi;

import java.util.Random;

//先攻後攻を決め、値を保持する。
public class FirstSecond {

	private int fistSecond;

	//先攻後攻決めメソッド
	public int decideFirstSecont() {
		Random random = new Random();
		fistSecond = random.nextInt(2) + 1;
		return fistSecond;
	}

	public void setFistSecond(int fistSecond) {
		this.fistSecond = fistSecond;
	}

	public int getFistSecond() {
		return fistSecond;
	}
}
