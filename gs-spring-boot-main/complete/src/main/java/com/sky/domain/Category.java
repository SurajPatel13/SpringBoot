package com.sky.domain;

import java.util.Objects;

public class Category {
   
  public Category() {
	  
  }
	
	private String catId;
	private String catName;
	
	
	public String getCatId() {
		return catId;
	}


	public void setCatId(String catId) {
		this.catId = catId;
	}


	public String getCatName() {
		return catName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(catId, catName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(catId, other.catId) && Objects.equals(catName, other.catName);
	}


	public void setCatName(String catName) {
		this.catName = catName;
	}


	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + "]";
	}
	
}
