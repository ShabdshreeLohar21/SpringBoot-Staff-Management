package com.tka.spring_pstman_staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StaffController 
{
	
	
	@Autowired
	StaffService staffservice;
	
	// TEST API
	@GetMapping("/testing")
	public String getPage() {
	    return "welcome to Restfull api- staff shabdshree";
	}
	
	// ADD STAFF
	@PostMapping("/add-staff")
	public String addEmployee(@RequestBody Staff staff)
	{
	    return staffservice.addStaff(staff);
	}
	
	// GET STAFF BY ID
	@GetMapping("/get-staff/{id}")
	public Staff getStaffById(@PathVariable int id)
	{
	    return staffservice.getSatffById(id);
	}
	
	// GET ALL STAFF
	@GetMapping("/get-all-staff")
	public List<Staff> getAllStaff() {
	    return staffservice.getAllStaff();
	}
	
	// UPDATE STAFF
	@PutMapping("/update-staff/{id}")
	public Staff updateStaff(@PathVariable int id, @RequestBody Staff staff)
	{
	    return staffservice.updateStaff(id, staff);
	}
	
	// DELETE STAFF
	@DeleteMapping("/delete-staff/{id}")
	public String deleteStaff(@PathVariable int id)
	{
	    return staffservice.deleteStaff(id);
	}
	
	// GET STAFF BY NAME
	@GetMapping("/get-staff-name/{name}")
	public List<Staff> getStaffByName(@PathVariable String name)
	{
	    return staffservice.getStaffByName(name);
	}
	
	// GET STAFF BY ROLE
	@GetMapping("/get-staff-role/{role}")
	public List<Staff> getStaffByRole(@PathVariable String role)
	{
		
	    return staffservice.getStaffByRole(role);
	}
	
	// SORT SALARY ASCENDING
	@GetMapping("/salary-ascending")
	public List<Staff> getStaffsalaryincr() 
	{
	    return staffservice.getStaffsalaryincr();
	}
	
	// SORT SALARY DESCENDING
	@GetMapping("/salary-descending")
	public List<Staff> getStaffsalarydecr() 
	{
	    return staffservice.getStaffsalarydecr();
	}
	
	// SALARY GREATER THAN
	@GetMapping("/salary-greater/{amount}")
	public List<Staff> getStaffBySalaryGreater(@PathVariable double amount) 
	{
	    return staffservice.getStaffBySalaryGreater(amount);
	}
	
	// SALARY LESS THAN
	@GetMapping("/salary-less/{amount}")
	public List<Staff> getStaffBySalaryLess(@PathVariable double amount)
	{
	    return staffservice.getStaffBySalaryLess(amount);
	}
	
	// MAX SALARY STAFF
	@GetMapping("/max-salary")
	public List<Staff> getStaffBySalaryMAX() 
	{
	    return staffservice.getStaffBySalaryMAX();
	}
	
	// MIN SALARY STAFF
	@GetMapping("/min-salary")
	public List<Staff> getStaffBySalaryMin() 
	{
	    return staffservice.getStaffBySalaryMin();
	}

}
