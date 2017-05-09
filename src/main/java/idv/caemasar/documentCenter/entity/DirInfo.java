package idv.caemasar.documentCenter.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DirInfo {
	private int dir_userid;
	private String dir_path;
	private String dir_parent_path;
	private String dir_directory;
	private Date dir_creat_time;
	private String time;
	private int count;
	private double size;

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

	/**
	 * count属性的getter方法
	 */
	public int getCount() {
		return count;
	}

	/**
	 * count属性的setter方法
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * size属性的getter方法
	 */
	public double getSize() {
		return size;
	}

	/**
	 * size属性的setter方法
	 */
	public void setSize(double size) {
		this.size = size;
	}

	/**
	 * time属性的getter方法
	 */
	public String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(this.getDir_creat_time());
	}

	@Override
	public String toString() {
		return "DirInfo [dir_userid=" + dir_userid + ", dir_path=" + dir_path + ", dir_parent_path=" + dir_parent_path
				+ ", dir_directory=" + dir_directory + ", dir_creat_time=" + dir_creat_time + ", time=" + time
				+ ", count=" + count + ", size=" + size + "]";
	}

}
