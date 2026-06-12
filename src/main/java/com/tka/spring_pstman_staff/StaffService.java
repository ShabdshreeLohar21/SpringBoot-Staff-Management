package com.tka.spring_pstman_staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {


	@Autowired
	StaffDao staffdao;
	
	public String addStaff(Staff staff) 
	{
	    return staffdao.addStaff(staff);
	}
	
	public Staff getSatffById(int id) 
	{
	    return staffdao.getSatffById(id);
	}
	
	public List<Staff> getAllStaff() 
	{
	    return staffdao.getAllStaff();
	}
	
	public Staff updateStaff(int id, Staff staff) 
	{
	    return staffdao.updateStaff(id, staff);
	}
	
	public String deleteStaff(int id) 
	{
	    return staffdao.deleteStaff(id);
	}
	
	
	public List<Staff> getStaffByName(String name) 
	{
	    return staffdao.getStaffByName(name);
	}
	
	public List<Staff> getStaffByRole(String role) 
	{
	    return staffdao.getStaffByRole(role);
	}
	
	public List<Staff> getStaffsalaryincr() 
	{
	    return staffdao.getStaffsalaryincr();
	}
	
	public List<Staff> getStaffsalarydecr() 
	{
	    return staffdao.getStaffsalarydecr();
	}
	
	public List<Staff> getStaffBySalaryGreater(double amount) 
	{
	    return staffdao.getStaffBySalaryGreater(amount);
	}
	
	public List<Staff> getStaffBySalaryLess(double amount) 
	{
	    return staffdao.getStaffBySalaryLess(amount);
	}
	
	public List<Staff> getStaffBySalaryMAX() 
	{
	    return staffdao.getStaffBySalaryMAX();
	}
	
	public List<Staff> getStaffBySalaryMin() 
	{
	    return staffdao.getStaffBySalaryMin();
	}

}
