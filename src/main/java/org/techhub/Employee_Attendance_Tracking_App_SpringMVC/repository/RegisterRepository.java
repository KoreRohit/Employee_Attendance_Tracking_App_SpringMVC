package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.repository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.DataWrapper;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.DateModel;
import org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model.Registeration;

@Repository("regrepo")
public class RegisterRepository {
	@Autowired
	JdbcTemplate template;
	List<Registeration> list;
	List<DateModel> list1;
	List<String> username;
	int pidd=0;
	

	public boolean isAddProfile(final Registeration reg) {
		int value = template.update("insert into register values('0',?,?,?,?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, reg.getUsername());
				ps.setString(2, reg.getPassword());
				ps.setString(3, reg.getEmail());
				ps.setString(4, reg.getPhone());
			}
		});
		return value > 0 ? true : false;
	}

	//user login
	public List<Registeration> isLogin(final String username, final String password) {
		list = template.query("select * from register where username=? and password=?",
				new Object[] { username, password }, new RowMapper<Registeration>() {

					@Override
					public Registeration mapRow(ResultSet rs, int rowNum) throws SQLException {
						Registeration r = new Registeration();
						{
							pidd=rs.getInt(1);
							r.setPid(rs.getInt(1));
							r.setUsername(rs.getString(2));
							r.setPassword(rs.getString(3));
							return r;
						}
					}
				});
		return list;
	}
	
	public List<Registeration> viewAllData(){
		list=template.query("select *from register", new RowMapper<Registeration>() {

			@Override
			public Registeration mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Registeration reg=new Registeration();
					reg.setPid(rs.getInt(1));
					reg.setUsername(rs.getString(2));
					reg.setPassword(rs.getString(3));
					reg.setEmail(rs.getString(4));
					reg.setPhone(rs.getString(5));
					return reg;	
			}
			
		});
		return list;
	}
	
	public void saveCurrentDate() {
		System.out.println(pidd);
	    template.update("INSERT INTO report (pid, date, intime) VALUES (?, ?, ?)",
	                    new Object[]{pidd, new java.sql.Date(System.currentTimeMillis()), new java.sql.Time(System.currentTimeMillis())},
	                    new int[]{Types.INTEGER, Types.DATE, Types.TIME});
	}
	
	public void updateCurrentDate() {
	    template.update("UPDATE report SET outtime = ? WHERE date=?",
	                    new Object[]{new java.sql.Time(System.currentTimeMillis()),new java.sql.Date(System.currentTimeMillis())},
	                    new int[]{Types.TIME,Types.DATE});
	}
	
	//view in-out user
	public List<DateModel> viewinout(){
		list1=template.query("select date,intime,outtime from report where pid=?", new Object[] { pidd },new RowMapper<DateModel>() {

			@Override
			public DateModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				DateModel dm=new DateModel();
				dm.setDate(rs.getDate(1));
				dm.setIntime(rs.getTime(2));
				dm.setOuttime(rs.getTime(3));
					return dm;	
			}
			
		});
		return list1;
	}
	
//	public List<String> getAllUser(){
//		username=template.query("select username from register",new RowMapper<String>() {
//			
//			@Override
//			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
////				username.add(rs.getString(1));
//				String s =(rs.getString(1));
//						return s;
//			}	
//		});
//		System.out.println(username);
//		username.add("ram");
//		username.add("sham");
//		return username;
//	}
	
	public List<Registeration> getAllUser(){
		list=template.query("select id,username from register", new RowMapper<Registeration>() {

			@Override
			public Registeration mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Registeration reg=new Registeration();
					
					reg.setPid(rs.getInt(1));
					reg.setUsername(rs.getString(2));
					
					return reg;	
			}
			
		});
		System.out.println(list);
		return list;
	}
	
	//view specific user data
	
	public List<DataWrapper> viewAlldatauser() {
	    List<DataWrapper> list = template.query("SELECT r.id, r.username, r.password, r.email, r.phone, rr.date, rr.intime, rr.outtime FROM register r INNER JOIN report rr ON r.id = rr.pid WHERE rr.pid = ?",
	        new Object[] { pidd },
	        new RowMapper<DataWrapper>() {
	            @Override
	            public DataWrapper mapRow(ResultSet rs, int rowNum) throws SQLException {
	                Registeration reg = new Registeration();
	                DateModel dm = new DateModel();
	                reg.setPid(rs.getInt("id"));
	                reg.setUsername(rs.getString("username"));
	                reg.setPassword(rs.getString("password"));
	                reg.setEmail(rs.getString("email"));
	                reg.setPhone(rs.getString("phone"));
	                dm.setDate(rs.getDate("date"));
	                dm.setIntime(rs.getTime("intime"));
	                dm.setOuttime(rs.getTime("outtime"));
	                return new DataWrapper(reg, dm);
	            }
	        });

	    // Uncomment this line if you want to print the list to console for debugging purposes
	     System.out.println(list);

	    return list;
	}
	
	

	public List<DataWrapper> speviewAlldatauser(int pid) {
	    List<DataWrapper> list = template.query("SELECT r.id, r.username, r.password, r.email, r.phone, rr.date, rr.intime, rr.outtime FROM register r INNER JOIN report rr ON r.id = rr.pid WHERE rr.pid = ?",
	        new Object[] { pid },
	        new RowMapper<DataWrapper>() {
	            @Override
	            public DataWrapper mapRow(ResultSet rs, int rowNum) throws SQLException {
	                Registeration reg = new Registeration();
	                DateModel dm = new DateModel();
	                reg.setPid(rs.getInt("id"));
	                reg.setUsername(rs.getString("username"));
	                reg.setPassword(rs.getString("password"));
	                reg.setEmail(rs.getString("email"));
	                reg.setPhone(rs.getString("phone"));
	                dm.setDate(rs.getDate("date"));
	                dm.setIntime(rs.getTime("intime"));
	                dm.setOuttime(rs.getTime("outtime"));
	                return new DataWrapper(reg, dm);
	            }
	        });

	    // Uncomment this line if you want to print the list to console for debugging purposes
	     System.out.println(list);

	    return list;
	}

	
}
