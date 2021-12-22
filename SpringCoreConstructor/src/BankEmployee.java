
public class BankEmployee {
	private String bankEmployee;
	private boolean isPrivate;
	public BankEmployee(String bankEmployee, boolean isPrivate) {
		super();
		this.bankEmployee = bankEmployee;
		this.isPrivate = isPrivate;
	}
	public BankEmployee() {
		super();
	}
	@Override
	public String toString() {
		return "[bankEmployee=" + bankEmployee + ", isPrivate=" + isPrivate + "]";
	}
	
}
