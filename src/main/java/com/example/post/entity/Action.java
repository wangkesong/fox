package com.example.post.entity;


public class Action {
	private int Id;
	private String a_Add;
	private String a_Drop;
	private String a_Delete;
	private String a_Show;
	private String a_Select;
	public Action(){}
	public Action(int Id,String a_Add,String a_Drop,String a_Delete,String a_Show,String a_Select){
		this.Id=Id;
		this.a_Add=a_Add;
		this.a_Drop=a_Drop;
		this.a_Delete=a_Delete;
		this.a_Show=a_Show;
		this.a_Select=a_Select;
	}
	public void setId(int Id){
		this.Id = Id;
	}
	public int getId(){
		return Id;
	}
	public void setA_Add(String a_Add){
		this.a_Add = a_Add;
	}
	public String getA_Add(){
		return a_Add;
	}
	public void setA_Drop(String a_Drop){
		this.a_Drop = a_Drop;
	}
	public String getA_Drop(){
		return a_Drop;
	}
	public void setA_Delete(String a_Delete){
		this.a_Delete = a_Delete;
	}
	public String getA_Delete(){
		return a_Delete;
	}
	public void setA_Show(String a_Show){
		this.a_Show = a_Show;
	}
	public String getA_Show(){
		return a_Show;
	}
	public void setA_Select(String a_Select){
		this.a_Select = a_Select;
	}
	public String getA_Select(){
		return a_Select;
	}
}
