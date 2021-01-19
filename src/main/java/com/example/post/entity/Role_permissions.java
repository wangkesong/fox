package com.example.post.entity;


public class Role_permissions {
	private int r_id;
	private int a_id;
	private int g_id;
	public Role_permissions(){}
	public Role_permissions(int r_id,int a_id,int g_id){
		this.r_id=r_id;
		this.a_id=a_id;
		this.g_id=g_id;
	}
	public void setR_id(int r_id){
		this.r_id = r_id;
	}
	public int getR_id(){
		return r_id;
	}
	public void setA_id(int a_id){
		this.a_id = a_id;
	}
	public int getA_id(){
		return a_id;
	}
	public void setG_id(int g_id){
		this.g_id = g_id;
	}
	public int getG_id(){
		return g_id;
	}
}
