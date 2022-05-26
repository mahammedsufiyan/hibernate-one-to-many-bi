package com.ty.one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
	@Id
	private int id;
	private String name;
	private int gstNum;
	private String website;
	@OneToMany(mappedBy = "hospital")
	private List<Branch> branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGstNum() {
		return gstNum;
	}
	public void setGstNum(int gstNum) {
		this.gstNum = gstNum;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	
}
