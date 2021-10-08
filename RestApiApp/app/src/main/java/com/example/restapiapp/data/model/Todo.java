package com.example.restapiapp.data.model;

import com.google.gson.annotations.SerializedName;

public class Todo{

	@SerializedName("is_done")
	private boolean isDone;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public boolean isIsDone(){
		return isDone;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}