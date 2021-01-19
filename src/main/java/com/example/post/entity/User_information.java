package com.example.post.entity;


public class User_information {
	private int u_i_id;
	private String u_i_Name;
	private boolean u_i_Sex;
	private int u_i_Class;
	private String u_i_statement;
	public User_information(){}
	public User_information(int u_i_id,String u_i_Name,boolean u_i_Sex,int u_i_Class,String u_i_statement){
		this.u_i_id=u_i_id;
		this.u_i_Name=u_i_Name;
		this.u_i_Sex=u_i_Sex;
		this.u_i_Class=u_i_Class;
		this.u_i_statement=u_i_statement;
	}
	public void setU_i_id(int u_i_id){
		this.u_i_id = u_i_id;
	}
	public int getU_i_id(){
		return u_i_id;
	}
	public void setU_i_Name(String u_i_Name){
		this.u_i_Name = u_i_Name;
	}
	public String getU_i_Name(){
		return u_i_Name;
	}
	public void setU_i_Sex(boolean u_i_Sex){
		this.u_i_Sex = u_i_Sex;
	}
	public boolean getU_i_Sex(){
		return u_i_Sex;
	}
	public void setU_i_Class(int u_i_Class){
		this.u_i_Class = u_i_Class;
	}
	public int getU_i_Class(){
		return u_i_Class;
	}
	public void setU_i_statement(String u_i_statement){
		this.u_i_statement = u_i_statement;
	}
	public String getU_i_statement(){
		return u_i_statement;
	}
}
