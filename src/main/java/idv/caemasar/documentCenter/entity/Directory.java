package idv.caemasar.documentCenter.entity;

import java.util.Date;

public class Directory {
	private int dir_id;
	private int dir_userid;
	private String dir_path;
	private String dir_parent_path;
	private String dir_directory;
	private Date dir_creat_time;
	private int dir_type;

	public int getDir_id() {
		return dir_id;
	}

	public void setDir_id(int dir_id) {
		this.dir_id = dir_id;
	}

	public int getDir_userid() {
		return dir_userid;
	}

	public void setDir_userid(int dir_userid) {
		this.dir_userid = dir_userid;
	}

	public String getDir_path() {
		return dir_path;
	}

	public void setDir_path(String dir_path) {
		this.dir_path = dir_path;
	}

	public String getDir_parent_path() {
		return dir_parent_path;
	}

	public void setDir_parent_path(String dir_parent_path) {
		this.dir_parent_path = dir_parent_path;
	}

	public String getDir_directory() {
		return dir_directory;
	}

	public void setDir_directory(String dir_directory) {
		this.dir_directory = dir_directory;
	}

	public Date getDir_creat_time() {
		return dir_creat_time;
	}

	public void setDir_creat_time(Date dir_creat_time) {
		this.dir_creat_time = dir_creat_time;
	}

	public int getDir_type() {
		return dir_type;
	}

	public void setDir_type(int dir_type) {
		this.dir_type = dir_type;
	}

	@Override
	public String toString() {
		return "Directory [dir_id=" + dir_id + ", dir_userid=" + dir_userid + ", dir_path=" + dir_path
				+ ", dir_parent_path=" + dir_parent_path + ", dir_directory=" + dir_directory + ", dir_creat_time="
				+ dir_creat_time + ", dir_type=" + dir_type + "]";
	}

}
