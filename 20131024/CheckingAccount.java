/**
 * ���� ���� Ŭ����
 * @author 20131010 ������
 *
 */
public class CheckingAccount extends Account{
	CheckingAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
		// TODO Auto-generated constructor stub
	}

	String cardNo;

	int pay(String cardNo, int amount) throws Exception {

		if(this.cardNo == cardNo && this.balance > amount){
			return withdraw(amount);
		}else{
			throw new Exception("�ܾ��� �����մϴ�.");
		}
	}
}
