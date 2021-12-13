package com.example.demo.entity;

public class WordInfo{
	
	private int id;
	private String word;
	private int st_cd;
	private String comment;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word=word;
	}
	
	public int getSt_cd() {
		return st_cd;
	}
	
	public void setSt_cd(int st_cd) {
		this.st_cd=st_cd;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment=comment;
	}
}