package com.yc.java018MenuSys;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Food> menuList;
	

	public List<Food> getMenuList() {
		return menuList;
	}

	public Menu() {
		menuList = new ArrayList<Food>();
		menuList.add(new Food(1, "Ϸ��С����", 28));
		menuList.add(new Food(2, "�ڽ�ţ��", 32));
		menuList.add(new Food(3, "ʲ���ն���", 20));
		menuList.add(new Food(4, "���ӳ�������", 25));
		menuList.add(new Food(5, "����������", 45));
	}

	@Override
	public String toString() {
		String info = "";
		for (Food f : menuList) {
			info += f.getId() + "\t";
			info += f.getName() + "\t";
			info += f.getPrice() + "\n";
		}
		return info;
	}

}
