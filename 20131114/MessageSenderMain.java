
public class MessageSenderMain {
	public static void main(String[] args){
		EMailSender obj1 = new EMailSender(
				"생일을 축하합니다",
				"고객센터",
				"admim@kaywon.ac.kr",
				"10% 쿠폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender(
				"생일을 축하합니다",
				"고객센터",
				"02-0000-0000",
				"10% 할인 쿠폰이 발행되었습니다.");
		
		obj1.sendMessage("sootan77@gmail.com");
		obj2.sendMessage("011-709-2255");


	}

}
