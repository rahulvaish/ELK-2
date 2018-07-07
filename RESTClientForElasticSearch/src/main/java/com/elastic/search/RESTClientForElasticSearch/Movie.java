package com.elastic.search.RESTClientForElasticSearch;

public class Movie {

	public String title;
	public String category;
	public String published_date;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", category=" + category + ", published_date=" + published_date + "]";
	}
	public Movie(String title, String category, String published_date) {
		super();
		this.title = title;
		this.category = category;
		this.published_date = published_date;
	}
	
	public Movie() {
		
	}
	
	
}
