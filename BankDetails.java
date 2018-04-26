public class BankDetails{
	private int accountNumber;
	private String bankName,ifscCode;

	public BankDetails(int accountNumber,String bankName,String ifscCode){

	this.accountNumber = accountNumber;
	this.bankName = bankName;
	this.ifscCode = ifscCode;
}
	public int getAccountNumber (int accountNumber){
		return this.accountNumber;
	}
	public void setAccountNumber (int accountNumber){
		this.accountNumber = accountNumber;
	}
	public String getBankName (String bankName){
		return this.bankName;
	}
	public void setBankName (String bankName){
		this.bankName = bankName;
	}
	public String getIfscCode (String ifscCode){
		return this.ifscCode;
	}
	public void setIfscCode (String ifscCode){
		this.ifscCode = ifscCode;
	}





}