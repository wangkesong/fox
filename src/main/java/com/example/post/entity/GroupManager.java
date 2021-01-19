package com.example.post.entity;


public class GroupManager {
	private int g_Id;
	private String role;
	public GroupManager(){}
	public GroupManager(int g_Id,String role){
		this.g_Id=g_Id;
		this.role=role;
	}
	public void setG_Id(int g_Id){
		this.g_Id = g_Id;
	}
	public int getG_Id(){
		return g_Id;
	}
	public void setRole(String role){
		this.role = role;
	}
	public String getRole(){
		return role;
	}
}
