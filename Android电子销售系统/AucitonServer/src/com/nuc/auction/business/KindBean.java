package com.nuc.auction.business;

/**
 * Description: <br/>
 * 网站: <a href="http://www.nuc.edu.cn/">中北大学</a> <br/>
 * Copyright (C), 2015 FanYu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author 2015 FanYu
 * @version 1.0
 */
public class KindBean {
	private int id;
	private String kindName;
	private String kindDesc;

	// 无参数的构造器
	public KindBean() {
	}

	// 初始化全部属性的构造器
	public KindBean(int id, String kindName, String kindDesc) {
		this.id = id;
		this.kindName = kindName;
		this.kindDesc = kindDesc;
	}

	// id的setter和getter方法
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	// kindName的setter和getter方法
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getKindName() {
		return this.kindName;
	}

	// kindDesc的setter和getter方法
	public void setKindDesc(String kindDesc) {
		this.kindDesc = kindDesc;
	}

	public String getKindDesc() {
		return this.kindDesc;
	}
}