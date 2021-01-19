package com.example.post.entity;


public class Section {
	private int s_Id;
	private String s_Name;
	private int s_MasterId;
	private String s_Statement;
	private int s_ClickCount;
	private int s_TopicCount;
	public Section(){}
	public Section(int s_Id,String s_Name,int s_MasterId,String s_Statement,int s_ClickCount,int s_TopicCount){
		this.s_Id=s_Id;
		this.s_Name=s_Name;
		this.s_MasterId=s_MasterId;
		this.s_Statement=s_Statement;
		this.s_ClickCount=s_ClickCount;
		this.s_TopicCount=s_TopicCount;
	}
	public void setS_Id(int s_Id){
		this.s_Id = s_Id;
	}
	public int getS_Id(){
		return s_Id;
	}
	public void setS_Name(String s_Name){
		this.s_Name = s_Name;
	}
	public String getS_Name(){
		return s_Name;
	}
	public void setS_MasterId(int s_MasterId){
		this.s_MasterId = s_MasterId;
	}
	public int getS_MasterId(){
		return s_MasterId;
	}
	public void setS_Statement(String s_Statement){
		this.s_Statement = s_Statement;
	}
	public String getS_Statement(){
		return s_Statement;
	}
	public void setS_ClickCount(int s_ClickCount){
		this.s_ClickCount = s_ClickCount;
	}
	public int getS_ClickCount(){
		return s_ClickCount;
	}
	public void setS_TopicCount(int s_TopicCount){
		this.s_TopicCount = s_TopicCount;
	}
	public int getS_TopicCount(){
		return s_TopicCount;
	}
}
