package com.rest.exception;

public class ExceptionResponse {
	private long time;
	private String message;
	private int Status;
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public ExceptionResponse(long time, String message, int i) {
		super();
		this.time = time;
		this.message = message;
		Status = i;
	}
	
	

}
