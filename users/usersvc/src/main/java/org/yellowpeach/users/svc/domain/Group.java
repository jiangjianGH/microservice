package org.yellowpeach.users.svc.domain;

public class Group {
	private Integer id;
	private String name;
	private String description;
	public Group(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.description = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desc) {
		this.description = desc;
	}

}
