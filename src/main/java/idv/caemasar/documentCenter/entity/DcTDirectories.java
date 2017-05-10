package idv.caemasar.documentCenter.entity;
// Generated 2017-5-11 2:20:14 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DcTDirectories generated by hbm2java
 */
public class DcTDirectories implements java.io.Serializable {

	private Integer dirId;
	private DcTUsers dcTUsers;
	private String dirPath;
	private String dirParentPath;
	private String dirDirectory;
	private Date dirCreatTime;
	private Integer dirType;
	private Set dcTDirectoryLogs = new HashSet(0);
	private Set dcTFileses = new HashSet(0);

	public DcTDirectories() {
	}

	public DcTDirectories(DcTUsers dcTUsers, String dirPath, String dirParentPath, String dirDirectory,
			Date dirCreatTime, Integer dirType, Set dcTDirectoryLogs, Set dcTFileses) {
		this.dcTUsers = dcTUsers;
		this.dirPath = dirPath;
		this.dirParentPath = dirParentPath;
		this.dirDirectory = dirDirectory;
		this.dirCreatTime = dirCreatTime;
		this.dirType = dirType;
		this.dcTDirectoryLogs = dcTDirectoryLogs;
		this.dcTFileses = dcTFileses;
	}

	public Integer getDirId() {
		return this.dirId;
	}

	public void setDirId(Integer dirId) {
		this.dirId = dirId;
	}

	public DcTUsers getDcTUsers() {
		return this.dcTUsers;
	}

	public void setDcTUsers(DcTUsers dcTUsers) {
		this.dcTUsers = dcTUsers;
	}

	public String getDirPath() {
		return this.dirPath;
	}

	public void setDirPath(String dirPath) {
		this.dirPath = dirPath;
	}

	public String getDirParentPath() {
		return this.dirParentPath;
	}

	public void setDirParentPath(String dirParentPath) {
		this.dirParentPath = dirParentPath;
	}

	public String getDirDirectory() {
		return this.dirDirectory;
	}

	public void setDirDirectory(String dirDirectory) {
		this.dirDirectory = dirDirectory;
	}

	public Date getDirCreatTime() {
		return this.dirCreatTime;
	}

	public void setDirCreatTime(Date dirCreatTime) {
		this.dirCreatTime = dirCreatTime;
	}

	public Integer getDirType() {
		return this.dirType;
	}

	public void setDirType(Integer dirType) {
		this.dirType = dirType;
	}

	public Set getDcTDirectoryLogs() {
		return this.dcTDirectoryLogs;
	}

	public void setDcTDirectoryLogs(Set dcTDirectoryLogs) {
		this.dcTDirectoryLogs = dcTDirectoryLogs;
	}

	public Set getDcTFileses() {
		return this.dcTFileses;
	}

	public void setDcTFileses(Set dcTFileses) {
		this.dcTFileses = dcTFileses;
	}

}