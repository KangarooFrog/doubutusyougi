package doubutusyougi;

import java.util.Random;
//先攻後攻決め
public class FirstSecond {

	private int fistSecond;

	public int decideFirstSecont() {
		Random random = new Random();
		//fistSecond = random.nextInt(2) + 1;
		fistSecond =1;
		return fistSecond;
	}

	public int getFistSecond() {
		return fistSecond;
	}
}
