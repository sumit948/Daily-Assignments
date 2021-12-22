
public class BankAdmin {
	private String adminName;
	private long adminId;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	@Override
	public String toString() {
		return "[adminName=" + adminName + ", adminId=" + adminId + "]";
	}
	
}
