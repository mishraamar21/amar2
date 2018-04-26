public class Salary{
	private float basicSalary, hra, conveyenceAllowance, 
	otherAllowance,personalAllowance,monthlyTax, epf,
	companyPf,gratuity,grossSalary,netSalary;
        
	public Salary (float basicSalary,float hra,float conveyenceAllowance,float otherAllowance,float personalAllowance,float monthlyTax,float epf,float companyPf,
			float gratuity,float grossSalary,float netSalary){
		this.basicSalary = basicSalary;
	        this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
                this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.gratuity = gratuity;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
}
	public float getBasicSalary (float basicSalary){
		return this. basicSalary;
        }
	public void setBasicSalary (float basicSalary){
		this.basicSalary = basicSalary;
        }
	public float getHra (float hra){
		return this. hra;
	} 
	public void setHra (float hra){
		this.hra = hra;
	} 
	public float getConveyenceAllowance (float conveyenceAllowance){
		return this.conveyenceAllowance;
	} 
	public void setConveyenceAllowance (float conveyenceAllowance){
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public float getOtherAllowance (float otherAllowance){
		return this.otherAllowance;
	}
	public void setOtherAllowance (float otherAllowance){
		this.personalAllowance = personalAllowance;
	}
	public float getMonthlyTax (float monthlyTax){
		 return this.monthlyTax = monthlyTax;
	}
	public void setMonthlyTax (float monthlyTax){
		this.monthlyTax = monthlyTax;
	}
	public float getEpf (float epf){
		return this.epf;
	}
	public void setEpf (float epf){
		this.epf = epf;
	}
	public float getCompanyPf (float companyPf){
		return this.companyPf;
	}
	public void setCompanyPf (float companyPf){
		this.companyPf = companyPf;
	}
	public float getGratuity (float gratuity){
		return this.gratuity;
	}
	public void setGratuity (float gratuity){
		this.gratuity = gratuity;
	}
	public float getGrossSalary (float grossSalary){
		return this.grossSalary;
	}
	public void setGrossSalary (float grossSalary){
		this.grossSalary = grossSalary;
	}
	public float getNetSalary (float netSalary){
		return this.netSalary;
	}
	public void setNetSalary (float netSalary){
		this.netSalary = netSalary;
	}
}