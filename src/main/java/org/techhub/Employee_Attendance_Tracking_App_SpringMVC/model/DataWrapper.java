package org.techhub.Employee_Attendance_Tracking_App_SpringMVC.model;

public class DataWrapper {
	private Registeration registeration;
    private DateModel dateModel;

    public DataWrapper(Registeration registeration, DateModel dateModel) {
        this.registeration = registeration;
        this.dateModel = dateModel;
    }

	public Registeration getRegisteration() {
		return registeration;
	}

	public void setRegisteration(Registeration registeration) {
		this.registeration = registeration;
	}

	public DateModel getDateModel() {
		return dateModel;
	}

	public void setDateModel(DateModel dateModel) {
		this.dateModel = dateModel;
	}
}
