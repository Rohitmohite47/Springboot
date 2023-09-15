package com.springrest.springrest.entity;

public class course {
	
	private long Id;
	private String Title;
	private String Description;
	
	
	public course(long id, String title, String description) {
		super();
		this.Id = id;
		this.Title = title;
		this.Description = description;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "course [Id=" + Id + ", Title=" + Title + ", Description=" + Description + "]";
	}
	
	

}
