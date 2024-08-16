package com.example.demo.exception;

import java.util.Date;

public class ErrorCode {

	private Integer code;
	public Integer getCode() {
		return code;
	}
	public String getDesc() {
		return desc;
	}
	public Date getDate() {
		return date;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private String desc;
	private Date date;
	@Override
	public String toString() {
		return "ErrorCode [code=" + code + ", desc=" + desc + ", date=" + date + "]";
	}
	public ErrorCode() {
		// TODO Auto-generated constructor stub
	}
	public ErrorCode(Integer code, String desc, Date date) {
		super();
		this.code = code;
		this.desc = desc;
		this.date = date;
	}
}
