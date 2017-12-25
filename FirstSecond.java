package doubutusyougi;

import java.util.Random;

public class FirstSecond {
//現在のプレイヤーが誰なのか保持する
	private int fistSecond;

	//先攻後攻決め
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
