package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.DataWrapper;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.DateModel;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.Registeration;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository regrepo;
	
	public boolean isAddProfile(Registeration reg)
	{
		boolean b=regrepo.isAddProfile(reg);
		return b;
	}

	public List<Registeration> loginUser(String username, String password) {
	return regrepo.isLogin(username,password);
	}
	
	public List<Registeration> viewuserdata(){
		return regrepo.viewAllData();
	}
	
	 public void saveCurrentDate() {
	        regrepo.saveCurrentDate();
	    }
	 
	 public void updateCurrentDate() {
		 regrepo.updateCurrentDate();
	 }
	
	 public List<DateModel> isviewinout(){
		 return regrepo.viewinout();
	 }
	 
	 public List<Registeration> getAllUser(){
		 
		 return regrepo.getAllUser();
	 }
	 
	 public List<DataWrapper> viewAlldatauser(){
		 return regrepo.viewAlldatauser();
	 }
	 
	 public List<DataWrapper> speviewAlldatauser(int pid){
		 return regrepo.speviewAlldatauser(pid);
	 }
}
