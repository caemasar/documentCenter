package idv.caemasar.documentCenter.entity;
// Generated 2017-5-11 2:20:14 by Hibernate Tools 4.3.5.Final

import java.util.Date;

/**
 * DcTDirectoryLog generated by hbm2java
 */
public class DcTDirectoryLog implements java.io.Serializable {

	private Integer dlogId;
	private DcTDirectories dcTDirectories;
	private DcTUsers dcTUsers;
	private Date dlogTime;
	private String dlogOperation;

	public DcTDirectoryLog() {
	}

	public DcTDirectoryLog(DcTDirectories dcTDirectories, DcTUsers dcTUsers, Date dlogTime, String dlogOperation) {
		this.dcTDirectories = dcTDirectories;
		this.dcTUsers = dcTUsers;
		this.dlogTime = dlogTime;
		this.dlogOperation = dlogOperation;
	}

	public Integer getDlogId() {
		return this.dlogId;
	}

	public void setDlogId(Integer dlogId) {
		this.dlogId = dlogId;
	}

	public DcTDirectories getDcTDirectories() {
		return this.dcTDirectories;
	}

	public void setDcTDirectories(DcTDirectories dcTDirectories) {
		this.dcTDirectories = dcTDirectories;
	}

	public DcTUsers getDcTUsers() {
		return this.dcTUsers;
	}

	public void setDcTUsers(DcTUsers dcTUsers) {
		this.dcTUsers = dcTUsers;
	}

	public Date getDlogTime() {
		return this.dlogTime;
	}

	public void setDlogTime(Date dlogTime) {
		this.dlogTime = dlogTime;
	}

	public String getDlogOperation() {
		return this.dlogOperation;
	}

	public void setDlogOperation(String dlogOperation) {
		this.dlogOperation = dlogOperation;
	}

}
