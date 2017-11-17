package doubutusyougi;

import java.util.Random;

public class FirstSecond {

	private int fistSecond;

	public int decideFirstSecont() {
		Random random = new Random();
		fistSecond = random.nextInt(2) + 1;
		return fistSecond;
	}
}
