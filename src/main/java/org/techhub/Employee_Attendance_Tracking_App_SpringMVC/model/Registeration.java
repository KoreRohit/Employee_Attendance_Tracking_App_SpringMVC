package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model;

public class Registeration {
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Registeration [pid=" + pid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private String username;
	private String password;
	private String email;
	private String phone;

}
