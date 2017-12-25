package doubutusyougi;

public class Turn_change {
 public void turnChange(FirstSecond firstSecond ) {

		if(firstSecond.getFistSecond()==1) {
			firstSecond.setFistSecond(2);
			System.out.println("カタカナの番です。");
		}else if(firstSecond.getFistSecond()==2) {
			firstSecond.setFistSecond(1);
			System.out.println("ひらがなの番です。");
		}else {System.out.println("手順バグ");
		System.out.println("手順値:"+firstSecond.getFistSecond());}



 }
}
