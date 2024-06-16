package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.DataWrapper;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.Registeration;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.service.RegisterService;


@Controller
public class AdminController {
    @Autowired
    RegisterService regservice;
    List<Registeration> list;
    List<String> usernames;
    List<DataWrapper> listt;

    @RequestMapping("/adminlogin1")
    public String showAdminLoginForm() {
        return "adminlogin"; // Assuming "adminlogin" is the name of your admin login form view
    }

    @RequestMapping(value = "/adminlogin2", method = RequestMethod.POST)
    public String adminLogin(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        if (username.equals("admin") && password.equals("admin")) {
            return "adminwelcome"; 
        } else {
            request.setAttribute("error", "Invalid username or password");
            return "adminlogin"; 
        }
    }
    
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String ViewAllRecord(@PathVariable("id") Integer id,Map map) {
    	List<DataWrapper> list = regservice.speviewAlldatauser(id);
        map.put("regservice", list);
        for(DataWrapper r:list) {
        	//System.out.println(r.getPid()+"\t"+r.getUsername()+"\t"+r.getPassword()+"\t"+r.getEmail()+"\t"+r.getPhone());
        }
        return "viewallemployee";
    }
    
    @RequestMapping(value="/viewusername",method =RequestMethod.GET)
    public String viewusernames(Map map) {
    	List<Registeration> username=regservice.getAllUser();
    	map.put("regservice", username);
    	System.out.println(username);
    	return "viewusernames";
    }
    
    //view specific user data
    @RequestMapping(value="/specificuserdata", method=RequestMethod.GET)
    public String getAllDataForUser(Map map) {
    	List<DataWrapper> listt=regservice.viewAlldatauser();
    	map.put("regservice", listt);
        return "viewspecificemployee";
    }
}
