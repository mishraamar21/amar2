public class Associate{
	private int associateId,yearlyInvestmentUnder80C;
	private String firstname,lastname,department,designation,pancard,emailId;

	public Associate(int associateId,int yearlyInvestmentUnder80C, String firstname,String lastname,String department,String designation,String pancard,String emailId){
	
		this.associateId = associateId;
	        this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
}

	public int getAssociateId(){
		return this.associateId;
        }
	public void setAssociateId(int associateId){
		this.associateId = associateId;
        }
	public int getYearlyInvestmentUnder80C(){
		return this.yearlyInvestmentUnder80C;
	} 
	public void setYearlyInvestmentUnder80C (int yearlyInvestmentUnder80C){
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
	} 
	public String getFirstname(){
		return this.firstname;
	} 
	public void setFirstname (String firstname){
		this.firstname = firstname;
	}
	public String getLastname(){
		return this.lastname;
	}
	public void setLastname (String lastname){
		this.lastname = lastname;
	}
	public void setDepartment (String department){
		 this.department = department;
	}
	public String getDepartment(){
		return this.designation;
	}
	public void setDesignation (String designation){
		this.designation = designation;
	}
	public String getPancard(){
		return this.pancard;
	}
	public void setPancard (String pancard){
		this.pancard = pancard;
	}
	public String getEmailId(){
		return this.emailId;
	}
	public void setEmailId (String emailId){
		this.emailId = emailId;
	}
}