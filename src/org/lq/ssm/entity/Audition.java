package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 试听
 * @author lanqiao
 */
public class Audition {
	private Integer audition_id;//试听编号
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date audition_time;//试听时间
	private String audition_address;//试听地址
	private String audition_course;//试听课程
	private String audition_desc;//试听描述
	private Student student;     //学生类
	
	public Integer getAudition_id() {
		return audition_id;
	}
	public void setAudition_id(Integer auditionId) {
		audition_id = auditionId;
	}
	public Date getAudition_time() {
		return audition_time;
	}
	public void setAudition_time(Date auditionTime) {
		audition_time = auditionTime;
	}
	public String getAudition_address() {
		return audition_address;
	}
	public void setAudition_address(String auditionAddress) {
		audition_address = auditionAddress;
	}
	public String getAudition_course() {
		return audition_course;
	}
	public void setAudition_course(String auditionCourse) {
		audition_course = auditionCourse;
	}
	public String getAudition_desc() {
		return audition_desc;
	}
	public void setAudition_desc(String auditionDesc) {
		audition_desc = auditionDesc;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	

}
