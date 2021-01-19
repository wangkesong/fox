package com.example.post.entity;
import java.sql.*;


public class Topic {
	private int t_ID;
	private int s_ID;
	private int u_ID;
	private int t_ReplyCount;
	private String t_Topic;
	private Clob t_Contents;
	private String t_Time;
	private int t_ClickCount;
	private String t_LastClickT;
	public Topic(){}
	public Topic(int t_ID,int s_ID,int u_ID,int t_ReplyCount,String t_Topic,Clob t_Contents,String t_Time,int t_ClickCount,String t_LastClickT){
		this.t_ID=t_ID;
		this.s_ID=s_ID;
		this.u_ID=u_ID;
		this.t_ReplyCount=t_ReplyCount;
		this.t_Topic=t_Topic;
		this.t_Contents=t_Contents;
		this.t_Time=t_Time;
		this.t_ClickCount=t_ClickCount;
		this.t_LastClickT=t_LastClickT;
	}
	public void setT_ID(int t_ID){
		this.t_ID = t_ID;
	}
	public int getT_ID(){
		return t_ID;
	}
	public void setS_ID(int s_ID){
		this.s_ID = s_ID;
	}
	public int getS_ID(){
		return s_ID;
	}
	public void setU_ID(int u_ID){
		this.u_ID = u_ID;
	}
	public int getU_ID(){
		return u_ID;
	}
	public void setT_ReplyCount(int t_ReplyCount){
		this.t_ReplyCount = t_ReplyCount;
	}
	public int getT_ReplyCount(){
		return t_ReplyCount;
	}
	public void setT_Topic(String t_Topic){
		this.t_Topic = t_Topic;
	}
	public String getT_Topic(){
		return t_Topic;
	}
	public void setT_Contents(Clob t_Contents){
		this.t_Contents = t_Contents;
	}
	public Clob getT_Contents(){
		return t_Contents;
	}
	public void setT_Time(String t_Time){
		this.t_Time = t_Time;
	}
	public String getT_Time(){
		return t_Time;
	}
	public void setT_ClickCount(int t_ClickCount){
		this.t_ClickCount = t_ClickCount;
	}
	public int getT_ClickCount(){
		return t_ClickCount;
	}
	public void setT_LastClickT(String t_LastClickT){
		this.t_LastClickT = t_LastClickT;
	}
	public String getT_LastClickT(){
		return t_LastClickT;
	}
}
