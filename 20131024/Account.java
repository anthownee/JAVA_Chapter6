/**
 * 은행계좌 클래스
 * @author 길효열 20131010
 *
 */
class Account {
	/**
	 * 계좌번호
	 */
	String accountNo;
	/**
	 * 예금주 이름
	 */
	String ownerName;
	/**
	 * 잔액
	 */
	int balance;

	
	/**
	 * Account 생성자
	 * @param accountNo 	: 계좌번호
	 * @param ownerName : 예금주 이름 
	 * @param balance		: 잔액
	 */
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo; 
		this.ownerName = ownerName;  
		this.balance = balance;       
	}
	/**
	 * 예금한다. 
	 * @param amount : 입금액
	 */
	void  deposit(int amount)  {       
		this.balance += amount;
	}
	/**
	 * 출금한다.
	 * @param amount : 출금액
	 * @return : 출금액
	 * @throws Exception 
	 */
	int withdraw(int amount) throws Exception {
		if (this.balance < amount){
			//return 0;
			throw new Exception("잔액이 부족합니다.");
		}
		this.balance -= amount;
		return  this.balance;
	}
}




