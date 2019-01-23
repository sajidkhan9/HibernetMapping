package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.apache.coyote.http11.Http11AprProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.exception.EmployeeNotFound;
import com.rest.exception.ExceptionResponse;
import com.rest.model.Employee;

@RestController
public class Controller {
	
	List<Employee>empall = new ArrayList<Employee>();
	@PostConstruct
	public void data()
	{
		empall.add(new Employee(1,"anil","java"));
		empall.add(new Employee(2,"sajid","java"));
		empall.add(new Employee(3,"adad","java"));
		empall.add(new Employee(4,"asdadal","java"));
		
	}
	
	
	@GetMapping("/emp")
	public List<Employee> getall()
	{
		System.out.println("+++++++++++++++++");
		return empall;
	}
	
	@GetMapping("/emp/{id}")
	public Employee getone(@PathVariable int id)
	{
		
		id--;
		if(0>id||id>empall.size())
		{
			id++;
			throw new EmployeeNotFound("employee with id: "+id+" not found");
		}
		return empall.get(id);
	}
	@PostMapping("/emp")
	public Employee add(@RequestBody Employee obj)
	{
		System.out.println(obj);
		return obj;
	}
	
	@PutMapping("/emp")
	public Employee update(@RequestBody Employee obj)
	{
		System.out.println("you object updated");
		return obj;
	}
	@DeleteMapping("/emp")
	public Employee delete(@RequestBody Employee obj)
	{
		System.out.println("deleted*********");
		return obj;
	}
	
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> handller(EmployeeNotFound obj)
	{
		ExceptionResponse er = new ExceptionResponse(System.currentTimeMillis(), obj.getMessage(), HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ExceptionResponse>(er, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> handllers(Exception obj)
	{
		ExceptionResponse er = new ExceptionResponse(System.currentTimeMillis(), obj.getMessage(), HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ExceptionResponse>(er, HttpStatus.BAD_REQUEST);
	}
}
