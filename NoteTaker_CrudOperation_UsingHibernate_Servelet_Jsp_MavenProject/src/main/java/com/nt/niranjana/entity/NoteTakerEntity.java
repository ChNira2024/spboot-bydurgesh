package com.nt.niranjana.entity;
import java.util.Date;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="note_taker")
public class NoteTakerEntity 
{
	@Id
	private int  id;
	private String title;
	private String content;
	private Date addedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public NoteTakerEntity( String title, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(100000); //automatically create 5 digit random number
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}
	public NoteTakerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NoteTakerEntity [id=" + id + ", title=" + title + ", content=" + content + ", addedDate=" + addedDate
				+ "]";
	}
	
	
}
