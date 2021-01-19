package com.example.post.entity;


public class User_roles {
	private int u_r_Id;
	private int u_Id;
	private int r_id;
	public User_roles(){}
	public User_roles(int u_r_Id,int u_Id,int r_id){
		this.u_r_Id=u_r_Id;
		this.u_Id=u_Id;
		this.r_id=r_id;
	}
	public void setU_r_Id(int u_r_Id){
		this.u_r_Id = u_r_Id;
	}
	public int getU_r_Id(){
		return u_r_Id;
	}
	public void setU_Id(int u_Id){
		this.u_Id = u_Id;
	}
	public int getU_Id(){
		return u_Id;
	}
	public void setR_id(int r_id){
		this.r_id = r_id;
	}
	public int getR_id(){
		return r_id;
	}
}
