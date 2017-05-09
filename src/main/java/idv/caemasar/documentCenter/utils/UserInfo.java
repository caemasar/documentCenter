package idv.caemasar.documentCenter.utils;

import java.io.File;

public class UserInfo
{
    private String cookieUser;
    private String root;
    private String userRoot;
	private String dir;
	private String parentPath;
	private String time;
	private String uid;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * time属性的getter方法
	 */
	public String getTime()
	{
	
		return time;
	}
	/**
	 * time属性的setter方法 
	 */
	public void setTime(String time)
	{
		this.time = time;
	}
	/**
	 * dir属性的getter方法
	 */
	public String getDir()
	{
		return dir;
	}
	/**
	 * dir属性的setter方法
	 */
	public void setDir(String dir)
	{
		this.dir = dir;
	}
	/**
	 * parentPath属性的getter方法
	 */
	public String getParentPath()
	{
		return parentPath;
	}
	/**
	 * parentPath属性的setter方法
	 */
	public void setParentPath(String parentPath)
	{
		this.parentPath = parentPath;
	}
	/**
	 * cookieUser属性的getter方法
	 */
	public String getCookieUser()
	{
		return cookieUser;
	}
	/**
	 * cookieUser属性的setter方法
	 */
	public void setCookieUser(String cookieUser)
	{
		this.cookieUser = cookieUser;
	}
	/**
	 * root属性的getter方法
	 */
	public String getRoot()
	{
		return root;
	}
	/**
	 * root属性的setter方法
	 */
	public void setRoot(String root)
	{
		this.root = root;
	}
	/**
	 * userRoot属性的getter方法
	 */
	public String getUserRoot()
	{
		return userRoot;
	}
	/**
	 * userRoot属性的setter方法
	 */
	public void setUserRoot(String userRoot)
	{
		this.userRoot = userRoot;
	}
	
	public String getAbsolutePath(String path)
	{
		String absolutePath = userRoot
		+ (File.separator.equals("\\") ? path.replaceAll(
				"/", "\\\\") : path);
		return absolutePath;
	}
	@Override
	public String toString() {
		return "UserInfo [cookieUser=" + cookieUser + ", root=" + root + ", userRoot=" + userRoot + ", dir=" + dir
				+ ", parentPath=" + parentPath + ", time=" + time + ", uid=" + uid + "]";
	}
	
}
