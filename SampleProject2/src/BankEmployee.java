
public class BankEmployee {
	private String bankName;
	private boolean isPraivate;
	private String bankEmployee;
	private String department;
	private String city;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public boolean isPraivate() {
		return isPraivate;
	}
	public void setPraivate(boolean isPraivate) {
		this.isPraivate = isPraivate;
	}
	public String getBankEmployee() {
		return bankEmployee;
	}
	public void setBankEmployee(String bankEmployee) {
		this.bankEmployee = bankEmployee;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "BankEmployee [bankName=" + bankName + ", isPraivate=" + isPraivate + ", bankEmployee=" + bankEmployee
				+ ", department=" + department + ", city=" + city + "]";
	}
 	
}
