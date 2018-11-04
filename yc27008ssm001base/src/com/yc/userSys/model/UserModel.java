package com.yc.userSys.model;

public class UserModel {
	private int id;
	private String name;
	private String remark;
	private int groupId;

	private GroupModel groupModel;

	public GroupModel getGroupModel() {
		return groupModel;
	}

	public void setGroupModel(GroupModel groupModel) {
		this.groupModel = groupModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", remark=" + remark
				+ ", groupId=" + groupId + "]";
	}

	public UserModel(int id, String name, String remark, int groupId) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
		this.groupId = groupId;
	}

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String name, String remark, int groupId) {
		super();
		this.name = name;
		this.remark = remark;
		this.groupId = groupId;
	}

}
