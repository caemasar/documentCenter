package idv.caemasar.documentCenter.entity;

public class User {
	private int u_id;
	private String u_username;
	private String u_password;
	private String repassword;
	private String passwordMD5;
	private String u_realname;
	private String u_email;
	private String u_phone;
	private int u_deptid;
	private int u_identity;
	private String validationCode;

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_username() {
		return u_username;
	}

	public void setU_username(String u_username) {
		this.u_username = u_username;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getPasswordMD5() throws Exception {
		return idv.caemasar.documentCenter.utils.Encrypter.md5Encrypt(this.getU_password());
	}

	public void setPasswordMD5(String passwordMD5) {
		this.passwordMD5 = passwordMD5;
	}

	public String getU_realname() {
		return u_realname;
	}

	public void setU_realname(String u_realname) {
		this.u_realname = u_realname;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public int getU_deptid() {
		return u_deptid;
	}

	public void setU_deptid(int u_deptid) {
		this.u_deptid = u_deptid;
	}

	public int getU_identity() {
		return u_identity;
	}

	public void setU_identity(int u_identity) {
		this.u_identity = u_identity;
	}

	public String getValidationCode() {
		return validationCode;
	}

	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", repassword="
				+ repassword + ", passwordMD5=" + passwordMD5 + ", u_realname=" + u_realname + ", u_email=" + u_email
				+ ", u_phone=" + u_phone + ", u_deptid=" + u_deptid + ", u_identity=" + u_identity + ", validationCode="
				+ validationCode + "]";
	}

}
