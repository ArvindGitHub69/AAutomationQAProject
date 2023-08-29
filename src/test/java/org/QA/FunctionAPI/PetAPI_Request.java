package org.QA.FunctionAPI;

import java.util.Map;

public class PetAPI_Request {
	private String id;
	private Map<?, ?> category;
	private String name;
	private String status;
	private String photoUrls;
	private Map<?, ?> tags;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<?, ?> getCategory() {
		return category;
	}
	public void setCategory(Map<?, ?> category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String photoUrls) {
		this.photoUrls = photoUrls;
	}
	public Map<?, ?> getTags() {
		return tags;
	}
	public void setTags(Map<?, ?> tags) {
		this.tags = tags;
	}


}
