import java.util.Objects;

public class Employee {
	private String empoloyeeID;
	private String employeeName;
	private String employeeDepartment;
	private String employeeRole;
	private boolean employeeSalary;
	public String getEmpoloyeeID() {
		return empoloyeeID;
	}
	public void setEmpoloyeeID(String empoloyeeID) {
		this.empoloyeeID = empoloyeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public boolean isEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(boolean employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
//	@Override
//	public String toString() {
//		return "Employee [empoloyeeID=" + empoloyeeID + ", employeeName=" + employeeName + ", employeeDepartment="
//				+ employeeDepartment + ", employeeRole=" + employeeRole + ", employeeSalary=" + employeeSalary
//				+ ", getEmpoloyeeID()=" + getEmpoloyeeID() + ", getEmployeeName()=" + getEmployeeName()
//				+ ", getEmployeeDepartment()=" + getEmployeeDepartment() + ", getEmployeeRole()=" + getEmployeeRole()
//				+ ", isEmployeeSalary()=" + isEmployeeSalary() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeDepartment, employeeName, employeeRole, employeeSalary, empoloyeeID);
	}
	@Override
	public String toString() {
		return "Employee [empoloyeeID=" + empoloyeeID + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeRole=" + employeeRole + ", employeeSalary=" + employeeSalary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeDepartment, other.employeeDepartment)
				&& Objects.equals(employeeName, other.employeeName) && Objects.equals(employeeRole, other.employeeRole)
				&& employeeSalary == other.employeeSalary && Objects.equals(empoloyeeID, other.empoloyeeID);
	}
	
}
