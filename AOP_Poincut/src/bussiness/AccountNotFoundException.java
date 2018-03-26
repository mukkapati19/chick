package bussiness;

public class AccountNotFoundException extends RuntimeException {
	@Override
	public String toString(){
		return "invalid account";
		
		
	}

}
