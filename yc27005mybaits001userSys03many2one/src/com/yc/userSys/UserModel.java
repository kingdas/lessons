package com.yc.userSys;

/**
 * ʵ���� 1.����Ҫ˽�л�����Ҫ�ṩ�����Ķ���get/set���� 2.��Ҫ�ṩ�޲ι��췽��
 * 
 * @author Administrator
 * 
 */
public class UserModel {
	private Integer id;
	private String name;
	private String tel;
	private int group_id;
	
	private GroupModel groupModel;//����
	
	public GroupModel getGroupModel() {
		return groupModel;
	}
	public void setGroupModel(GroupModel groupModel) {
		this.groupModel = groupModel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", tel=" + tel
				+ ", group_id=" + group_id + "]";
	}
	public UserModel(Integer id, String name, String tel, int group_id) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.group_id = group_id;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(String name, String tel, int group_id) {
		super();
		this.name = name;
		this.tel = tel;
		this.group_id = group_id;
	}




	
}
