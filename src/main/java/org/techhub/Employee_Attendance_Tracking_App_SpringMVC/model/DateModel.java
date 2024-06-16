package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model;

import java.sql.Date;
import java.sql.Time;

public class DateModel {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private Date date;
	private Time intime;
	private Time outtime;
	
	public Time getIntime() {
		return intime;
	}
	public void setIntime(Time intime) {
		this.intime = intime;
	}
	public Time getOuttime() {
		return outtime;
	}
	public void setOuttime(Time outtime) {
		this.outtime = outtime;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
