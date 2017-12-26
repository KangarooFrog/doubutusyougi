package doubutusyougi;

public class KatakanaConversion {
	public static final char KATAKANA_SMALL_A = 12449;
	public static final char KATAKANA_NN = 12531;

	public static final char HIRAGANA_SMALL_A = 12353;
	public static final char HIRAGANA_NN = 12531;

	public String kanaToGana(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c >= KATAKANA_SMALL_A && c <= KATAKANA_NN) {
				sb.setCharAt(i, (char) (c - KATAKANA_SMALL_A + HIRAGANA_SMALL_A));
			}
		}
		return sb.toString();
	}
}
