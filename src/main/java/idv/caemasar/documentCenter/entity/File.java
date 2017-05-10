package idv.caemasar.documentCenter.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class File
{
	private int flie_id;
	private int file_userid;
	private String file_filename;
	private int file_path;
	private String flie_pathname;
	private double file_size;
	private Date file_uploadtime;
	private int file_type;
	private String time;

	public String getFlie_pathname() {
		return flie_pathname;
	}

	public void setFlie_pathname(String flie_pathname) {
		this.flie_pathname = flie_pathname;
	}

	public String getTime()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(this.getFile_uploadtime());
	}

	public int getFlie_id() {
		return flie_id;
	}

	public void setFlie_id(int flie_id) {
		this.flie_id = flie_id;
	}

	public int getFile_userid() {
		return file_userid;
	}

	public void setFile_userid(int file_userid) {
		this.file_userid = file_userid;
	}

	public String getFile_filename() {
		return file_filename;
	}

	public void setFile_filename(String file_filename) {
		this.file_filename = file_filename;
	}

	public int getFile_path() {
		return file_path;
	}

	public void setFile_path(int file_path) {
		this.file_path = file_path;
	}

	public double getFile_size() {
		return file_size;
	}

	public void setFile_size(double file_size) {
		this.file_size = file_size;
	}

	public Date getFile_uploadtime() {
		return file_uploadtime;
	}

	public void setFile_uploadtime(Date file_uploadtime) {
		this.file_uploadtime = file_uploadtime;
	}

	public int getFile_type() {
		return file_type;
	}

	public void setFile_type(int file_type) {
		this.file_type = file_type;
	}

}
