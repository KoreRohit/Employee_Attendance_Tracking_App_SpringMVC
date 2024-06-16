package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.DateModel;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.Registeration;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.service.RegisterService;

@Controller
public class HomeController {

	@Autowired
	RegisterService regservice;
	List<Registeration> list;
	List<DateModel> list1;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
//	//login logic
	
	@RequestMapping("/login1")
	public String loginpage()
	{
		return "login";
	}
	
	@RequestMapping("/logindata")
	public String login(@RequestParam String username, @RequestParam String password) {
	    List<Registeration> list = regservice.loginUser(username, password);
	    if (list != null && !list.isEmpty()) {
	        // Authentication successful
	        return "signin";
	    } else {
	        // Authentication failed
	        return "addnewemployee"; // or whatever view you want to return for failed login
	    }
	}


	//registeration logic
	 
	@RequestMapping(value="/createNewRecord")
	public String createNewRecord() {
		return "addnewemployee";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String acceptProfile(Registeration reg,Map map)
	{
		boolean b=regservice.isAddProfile(reg);
		if(b)
		{
			map.put("msg", "<h1 style='color:blue';>Profile Save Success.....</h1>");
		}
		else {
			map.put("msg","<h1 style='color:red';>Some Probleam is There...</h1>");
		}
		
		return "addnewemployee";
	}
	
	//date logic
	
	@RequestMapping("/saveDate")
    public String saveDate() {
        regservice.saveCurrentDate();
        return "signout";
    }
	
	@RequestMapping("/saveDate1")
    public String saveDate1() {
        regservice.updateCurrentDate();
        return "login";
    }
	
	@RequestMapping(value = "/viewinout", method = RequestMethod.GET)
    public String ViewInOut(Map map) {
    	List<DateModel> list1 = regservice.isviewinout();
        map.put("regservice", list1);
        return "ViewInOut";
    }
	
	
	
	
}
