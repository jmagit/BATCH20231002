package com.example.demo.model;

public class PhotoDTO {
	private String id, author, url, download_url;
	private int width, height;
	
	public PhotoDTO() {
		super();
	}
	public PhotoDTO(String id, String author, String url, String download_url, int width, int height) {
		super();
		this.id = id;
		this.author = author;
		this.url = url;
		this.download_url = download_url;
		this.width = width;
		this.height = height;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDownload_url() {
		return download_url;
	}
	public void setDownload_url(String download_url) {
		this.download_url = download_url;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "PhotoDTO [id=" + id + ", author=" + author + ", url=" + url + ", download_url=" + download_url
				+ ", width=" + width + ", height=" + height + "]";
	}

	
	
}
