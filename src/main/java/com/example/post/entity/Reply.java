package com.example.post.entity;
import java.sql.*;


public class Reply {
	private int r_ID;
	private int t_ID;
	private String r_toptic;
	private Clob r_Contents;
	private String r_Time;
	private int r_ClickCount;
	public Reply(){}
	public Reply(int r_ID,int t_ID,String r_toptic,Clob r_Contents,String r_Time,int r_ClickCount){
		this.r_ID=r_ID;
		this.t_ID=t_ID;
		this.r_toptic=r_toptic;
		this.r_Contents=r_Contents;
		this.r_Time=r_Time;
		this.r_ClickCount=r_ClickCount;
	}
	public void setR_ID(int r_ID){
		this.r_ID = r_ID;
	}
	public int getR_ID(){
		return r_ID;
	}
	public void setT_ID(int t_ID){
		this.t_ID = t_ID;
	}
	public int getT_ID(){
		return t_ID;
	}
	public void setR_toptic(String r_toptic){
		this.r_toptic = r_toptic;
	}
	public String getR_toptic(){
		return r_toptic;
	}
	public void setR_Contents(Clob r_Contents){
		this.r_Contents = r_Contents;
	}
	public Clob getR_Contents(){
		return r_Contents;
	}
	public void setR_Time(String r_Time){
		this.r_Time = r_Time;
	}
	public String getR_Time(){
		return r_Time;
	}
	public void setR_ClickCount(int r_ClickCount){
		this.r_ClickCount = r_ClickCount;
	}
	public int getR_ClickCount(){
		return r_ClickCount;
	}
}
