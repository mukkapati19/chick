package bussiness;

public class Bank {
private int amount =5000;
private String account="sbi143";
public int  deposite(int amount,String account) {
	
	
	
	if(account.equals(this.account)){
		this.amount=amount+this.amount;
	return this.amount;
	}
	else{
		throw new AccountNotFoundException();
	}
}
public int findAcnt(String account){
	
	return this.amount;
}
	}
