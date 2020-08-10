package org.dxctraining.hotelmgt.entities;

public class Guest {
	private String name;
	private String id;

	public Guest(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int hashCode() { 
		int hashId = id.hashCode();
		return hashId;
	}

	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj == null || !(obj instanceof Guest))
			return false;
		Guest that = (Guest) obj;
		boolean isequal = this.id.equals(that.id);
		return isequal;
	}
}