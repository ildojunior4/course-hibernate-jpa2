package com.hir.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ildo-zrj on 28/06/2016.
 */
@Entity
public class Client {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long code;
	
	private String name;
	private Integer age;
	private String sex;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long id) {
		this.code = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
