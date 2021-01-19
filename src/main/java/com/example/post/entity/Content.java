package com.example.post.entity;
import java.sql.*;


public class Content {
	private int c_id;
	private Clob c_Contents;
	public Content(){}
	public Content(int c_id,Clob c_Contents){
		this.c_id=c_id;
		this.c_Contents=c_Contents;
	}
	public void setC_id(int c_id){
		this.c_id = c_id;
	}
	public int getC_id(){
		return c_id;
	}
	public void setC_Contents(Clob c_Contents){
		this.c_Contents = c_Contents;
	}
	public Clob getC_Contents(){
		return c_Contents;
	}
}
