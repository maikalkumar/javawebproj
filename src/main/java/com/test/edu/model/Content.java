package com.test.edu.model;

public class Content {
	String contentType;
	String contentDescription;
	int    contentId;
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentDescription() {
		return contentDescription;
	}
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	@Override
	public String toString() {
		return "Content [contentType=" + contentType + ", contentDescription=" + contentDescription + ", contentId="
				+ contentId + "]";
	}
	
	
}
